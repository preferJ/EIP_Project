package com.its.board.service;

import com.its.board.dto.MemberDTO;
import com.its.board.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {
        memberRepository.save(memberDTO);
    }


    public boolean nameDup(String memberName) {
        MemberDTO newMemberDTO = memberRepository.findByName(memberName);
        if (newMemberDTO == null) {
            return true;
        } else {
            return false;
        }
    }

    public MemberDTO findByName(String memberName) {
        return memberRepository.findByName(memberName);
    }
}


