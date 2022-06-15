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


//    @PostMapping("/save")
//    public String makeForm(@RequestParam("makeQ") String makeQ,
//                           @RequestParam("dateQ") String dateQ,
//                           @RequestParam("makeA") String makeA
//    ) {
//        // 정답 제조기 -----------------------------------------------------------
//        String[] AnswerText = makeA.split("");
//        List<Integer> AnswerList = new ArrayList<>();
//        Map<Integer, Integer> ansMap = new HashMap<>();
//        for (int i = 0; i < AnswerText.length; i++) {
//            int tempAns = 0;
//            if (AnswerText[i].equals("①") || AnswerText[i].equals("②") || AnswerText[i].equals("③") || AnswerText[i].equals("④")) {
//                if (AnswerText[i].equals("①")) {
//                    tempAns = 1;
//                }
//                if (AnswerText[i].equals("②")) {
//                    tempAns = 2;
//                }
//                if (AnswerText[i].equals("③")) {
//                    tempAns = 3;
//                }
//                if (AnswerText[i].equals("④")) {
//                    tempAns = 4;
//                }
//                AnswerList.add(tempAns);
//            }
//        }
//
//        for (int i = 1; i < AnswerList.size(); i++) {
//            ansMap.put(i, AnswerList.get(i - 1));
//        }
//// -----------------------------------------------
//
//// 문제 제조기 ------------------------------------------------
//        String temp = "";
//        String temp2 = "";
//        String[] problemText = makeQ.split("\\n");
//
//        String problemYear = dateQ;
//        String problemSubject = "";
//        int problemQNumber = 0;
//        String problemQ = "";
//        String problemA1 = "";
//        String problemA2 = "";
//        String problemA3 = "";
//        String problemA4 = "";
//        int problemAns = 0;
//        String problemCommentary = "";
//
//        for (int i = 0; i < problemText.length; i++) {
//
//            temp = problemText[i].replace("   ", "");
//            temp = temp.replace(" ①", "①");
//            temp = temp.replace(" ②", "②");
//            temp = temp.replace(" ③", "③");
//            temp = temp.replace(" ④", "④");
//            problemText[i] = temp;
//            if (problemText[i].length() < 5) {
//            } else if (problemText[i].startsWith("과목", 1)) {
//                problemSubject = problemText[i];
//            } else if ((problemText[i].charAt(1) == '.' || problemText[i].charAt(2) == '.') && problemText[i].contains("?")) {
//                problemQNumber = (Integer.parseInt(problemText[i].substring(0, problemText[i].indexOf("."))));
//                problemAns = ansMap.get(problemQNumber);
//                problemQ = problemText[i].substring(problemText[i].indexOf("."));
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
//                problemCommentary = problemCommentary + problemText[i];
//            }
//            if ((problemText[i].indexOf("]") + 10 > problemText.length)) {
//                ProblemDTO newpProblemDTO = new ProblemDTO(problemYear, problemSubject, problemQNumber, problemQ, problemA1, problemA2, problemA3, problemA4, problemAns, problemCommentary);
//                System.out.println(newpProblemDTO.getProblemYear());
//                System.out.println(newpProblemDTO.getProblemSubject());
//                System.out.print(newpProblemDTO.getProblemQNumber());
//                System.out.println(newpProblemDTO.getProblemQ());
//                System.out.println(newpProblemDTO.getProblemA1());
//                System.out.println(newpProblemDTO.getProblemA2());
//                System.out.println(newpProblemDTO.getProblemA3());
//                System.out.println(newpProblemDTO.getProblemA4());
//                System.out.println(newpProblemDTO.getProblemAns());
//                System.out.println(newpProblemDTO.getProblemCommentary());
////                problemService.save(newpProblemDTO);
//                problemCommentary = "";
//            }
//        }
//        return "index";
//    }


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
