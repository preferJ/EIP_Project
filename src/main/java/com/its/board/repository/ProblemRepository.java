package com.its.board.repository;

import com.its.board.dto.ProblemDTO;
import com.its.board.service.ProblemService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ProblemRepository {
@Autowired
private SqlSessionTemplate sql;
    public void save(ProblemDTO newProblemDTO) {
        sql.insert("Problem.save",newProblemDTO);
    }

    public List<ProblemDTO> findAll() {
       return sql.selectList("Problem.findAll");
    }

    public ProblemDTO findById(Long problemId) {
        return sql.selectOne("Problem.findById",problemId);
    }

    public List<ProblemDTO> searchList(Map<String, String> searchCondition) {
        return sql.selectList("Problem.searchList",searchCondition);
    }
}
