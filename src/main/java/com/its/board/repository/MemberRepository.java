package com.its.board.repository;

import com.its.board.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class MemberRepository {

    @Autowired
    private SqlSessionTemplate sql;
    public void save(MemberDTO memberDTO) {
        sql.insert("Member.save",memberDTO);
    }

    public MemberDTO findByName(String memberName) {
       return sql.selectOne("Member.findByNameForName",memberName);
    }

    public MemberDTO findById(int memberId) {
        return sql.selectOne("Member.findById",memberId);
    }

    public MemberDTO login(Map<String, String> map) {
        return sql.selectOne("Member.login",map);
    }
}
