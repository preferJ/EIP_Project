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
        String temp = "";
        String temp2 = "";
        String[] problemText = makeQ.split("\\n");
        ProblemDTO[] problemDTOS = new ProblemDTO[99];


        for (int i = 0; i < problemText.length; i++) {
            temp = problemText[i];

            temp2 = temp.replace("   ", "");

            problemText[i] = temp2;

            System.out.println(problemText[i]);


        }

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
            @RequestParam(value = "problemSubject", required = false, defaultValue = "No") String problemSubject, Model model
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
