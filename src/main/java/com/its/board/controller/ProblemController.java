package com.its.board.controller;

import com.its.board.dto.BoardDTO;
import com.its.board.dto.CommentDTO;
import com.its.board.dto.ProblemDTO;
import com.its.board.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.util.*;

@RequestMapping("/problem")
@Controller
public class ProblemController {
    @Autowired
    private ProblemService problemService;


    @GetMapping("/makeForm")
    public String makeForm() {
        return "problemP/problemMakeForm";
    }


    @PostMapping("/save")
    public String makeForm(@RequestParam("makeQ") String makeQ,
                           @RequestParam("dateQ") String dateQ,
                           @RequestParam("makeA") String makeA
    ) {
        // 정답 제조기 -----------------------------------------------------------
        String[] AnswerText = makeQ.split("\\t");
        Map<String, String> ansMap = new HashMap<>();
        for (int i = 0; i < AnswerText.length; i++) {
            if (i < 10 || (20 < i && i < 30) || (40 < i && i < 50) || (60 < i && i < 70) || (80 < i && i < 90)) {
                System.out.println(AnswerText[i]);
            }
        }


        int DTOCounter = 0;
        String temp = "";
        String temp2 = "";
        String[] problemText = makeQ.split("\\n");
        ProblemDTO[] problemDTOS = new ProblemDTO[99];

        String problemYear = "";
        String problemSubject = "";
        int problemQNumber = 0;
        String problemQ = "";
        String problemA1 = "";
        String problemA2 = "";
        String problemA3 = "";
        String problemA4 = "";
        int problemAns = 0;
        String problemCommentary = "";

// 문제 제조기 ------------------------------------------------
//        for (int i = 0; i < problemText.length; i++) {
//            temp = problemText[i];
//
//            temp2 = temp.replace("   ", "");
//
//            problemText[i] = temp2;
//
//            if (problemText[i].startsWith("과목", 1)) {
//                problemSubject = problemText[i];
//            } else if ((problemText[i].charAt(1) == '.' || problemText[i].charAt(2) == '.') && problemText[i].contains("?")) {
//                problemQNumber = (Integer.parseInt(problemText[i].substring(0, problemText[i].indexOf("."))));
//                problemQ = problemText[i].substring(problemText[i].indexOf("."),problemText.length);
//            } else if (problemText[i].startsWith("①")) {
//                if (problemText[i].contains("②")) {
//                    problemA1 = (problemText[i].substring(0, problemText[i].indexOf("②")));
//                    problemA2 = (problemText[i].substring(problemText[i].indexOf("②")));
//                } else {
//                    problemA1 = problemText[i];
//                }
//            } else if (problemText[i].startsWith("②")) {
//                problemA2 = problemText[i];
//            } else if (problemText[i].startsWith("③")) {
//                if (problemText[i].contains("④")) {
//                    problemA3 = (problemText[i].substring(0, problemText[i].indexOf("④")));
//                    problemA4 = (problemText[i].substring(problemText[i].indexOf("④")));
//                } else {
//                    problemA3 = problemText[i];
//                }
//            } else if (problemText[i].startsWith("④")) {
//                problemA4 = problemText[i];
//            } else {
//                problemCommentary += problemText[i];
//            }
//            if ((problemText[i].indexOf("]")+10 > problemText.length)) {
//                ProblemDTO newpProblemDTO = new ProblemDTO(problemSubject, problemQNumber, problemQ, problemA1, problemA2, problemA3, problemA4,problemCommentary);
//                problemCommentary = "";
//                System.out.println(newpProblemDTO.getProblemSubject());
//                System.out.print(newpProblemDTO.getProblemQNumber());
//                System.out.println(newpProblemDTO.getProblemQ());
//                System.out.println(newpProblemDTO.getProblemA1());
//                System.out.println(newpProblemDTO.getProblemA2());
//                System.out.println(newpProblemDTO.getProblemA3());
//                System.out.println(newpProblemDTO.getProblemA4());
//                System.out.println(newpProblemDTO.getProblemCommentary());
//            }
//
//
//        }
        return "index";
    }


    @GetMapping("/list")
    public String AllList(Model model) {
        List<ProblemDTO> problemList = problemService.findAll();
        model.addAttribute("problemList", problemList);
        return "problemP/list";
    }

    @GetMapping("/detail")
    public String findById(@RequestParam("problemId") Long problemId, Model model) {
        System.out.println(problemService.findById(problemId));
        model.addAttribute("ProblemDTO", problemService.findById(problemId));
        return "problemP/detail";
    }

    @GetMapping("/startPage")
    public String startPage() {
        return "problemP/startPage";
    }

    @PostMapping("/selectAndStart")
    public String selectAndStart(
            @RequestParam(value = "problemYear", required = false, defaultValue = "No") String problemYear,
            @RequestParam(value = "problemSubject", required = false, defaultValue = "No") String
                    problemSubject, Model model
//            @RequestParam(value = "xProblem", required = false, defaultValue = "No") String xProblem,
//            @RequestParam(value = "randomProblem", required = false, defaultValue = "No") String randomProblem, Model model
    ) {
        Map<String, String> searchCondition = new HashMap<>();
        if (problemSubject != "No") {
            searchCondition.put("problemSubject", "problemSubject");
        }
        if (problemYear != "No") {
            searchCondition.put("problemYear", "problemYear");
        }
        List<ProblemDTO> problemDTOList = problemService.searchList(searchCondition);
        model.addAttribute("problemDTOList", problemDTOList);

        return "problemP/solve";
    }


}
