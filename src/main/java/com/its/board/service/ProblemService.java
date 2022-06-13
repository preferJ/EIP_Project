package com.its.board.service;

import com.its.board.dto.ProblemDTO;
import com.its.board.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProblemService {
    @Autowired
    private ProblemRepository problemRepository;

    public void save(ProblemDTO newProblemDTO) {

    problemRepository.save(newProblemDTO);
    }
//
    public List<ProblemDTO> findAll() {
        return problemRepository.findAll();
    }

    public ProblemDTO findById(Long problemId) {
        return problemRepository.findById(problemId);
    }

    public List<ProblemDTO> searchList(Map<String, String> searchCondition) {
        return problemRepository.searchList(searchCondition);
    }
}
