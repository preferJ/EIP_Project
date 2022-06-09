package com.its.board.controller;

import com.its.board.service.DeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DeclarationController {
    @Autowired
    private DeclarationService declarationService;
}
