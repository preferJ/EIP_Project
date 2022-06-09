package com.its.board.controller;

import com.its.board.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FileController {
    @Autowired
    private FileService fileService;
}
