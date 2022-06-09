package com.its.board.service;

import com.its.board.repository.DeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeclarationService {
    @Autowired
    private DeclarationRepository declarationRepository;
}
