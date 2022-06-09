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

import java.util.ArrayList;
import java.util.List;

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
                           @RequestParam("dateQ") String dateQ) {
        String[] nn = makeQ.split("");

//문제 컷
        int n1 = 0;
        int n2;
        List<String> problem = new ArrayList<>();
        List<String> ans1 = new ArrayList<>();
        List<String> ans2 = new ArrayList<>();
        List<String> ans3 = new ArrayList<>();
        List<String> ans4 = new ArrayList<>();
        List<String> des = new ArrayList<>();

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < nn.length; i++) {
            if (nn[i].equals("?")) {

                n2 = i;
                for (int j = n1 ; j < n2 + 1; j++) {
                    temp.append(nn[j]);
                }
                problem.add(temp.toString());
                temp = new StringBuilder();
                n1 = i;
            }

            if (nn[i].equals("②")) {
                n2 = i;
                for (int j = n1 + 1; j < n2; j++) {
                    temp.append(nn[j]);
                }
                ans1.add(temp.toString());
                temp = new StringBuilder();
                n1 = i;
            }
            if (nn[i].equals("③")) {
                n2 = i;
                for (int j = n1; j < n2; j++) {
                    temp.append(nn[j]);
                }
                ans2.add(temp.toString());
                temp = new StringBuilder();
                n1 = i;
            }
            if (nn[i].equals("④")) {
                n2 = i;
                for (int j = n1; j < n2; j++) {
                    temp.append(nn[j]);
                }
                ans3.add(temp.toString());
                temp = new StringBuilder();
                n1 = i;
            }
            if (nn[i].equals("<")) {
                n2 = i;
                for (int j = n1; j < n2; j++) {
                    temp.append(nn[j]);
                }
                ans4.add(temp.toString());
                temp = new StringBuilder();
                n1 = i;
            }

            if (nn[i].equals("]")) {
                n2 = i;
                for (int j = n1; j < n2 + 1; j++) {
                    temp.append(nn[j]);
                }
                des.add(temp.toString());
                temp = new StringBuilder();
                n1 = i+1;
            }

        }


        for (int i = 0; i < problem.size(); i++) {
            ProblemDTO newProblemDTO = new ProblemDTO();
            newProblemDTO.setProblemQ(problem.get(i));
            newProblemDTO.setProblemA1(ans1.get(i));
            newProblemDTO.setProblemA2(ans2.get(i));
            newProblemDTO.setProblemA3(ans3.get(i));
            newProblemDTO.setProblemA4(ans4.get(i));
            newProblemDTO.setProblemCommentary(des.get(i));
            newProblemDTO.setProblemQNumber(i+1);
            newProblemDTO.setProblemYear(dateQ);
            System.out.println(newProblemDTO);
            problemService.save(newProblemDTO);
        }


        return "index";
    }


    @GetMapping("/list")
    public String AllList(Model model){
        List<ProblemDTO> problemList = problemService.findAll();
        model.addAttribute("problemList",problemList);
        return "problemP/list";
    }

    @GetMapping("/detail")
    public String findById(@RequestParam("problemId") Long problemId, Model model) {
        System.out.println(problemService.findById(problemId));
        model.addAttribute("ProblemDTO",problemService.findById(problemId));
        return "problemP/detail";
    }
}
