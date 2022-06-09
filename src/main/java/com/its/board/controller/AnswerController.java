package com.its.board.controller;

import com.its.board.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnswerController {
    @Autowired
    private AnswerService answerService;

}
