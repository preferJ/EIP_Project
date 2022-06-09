package com.its.board.controller;

import com.its.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;
}
