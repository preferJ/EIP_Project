package com.its.board.controller;

import com.its.board.dto.MemberDTO;
import com.its.board.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;


    @GetMapping("/saveForm")
    public String saveForm() {
        return ("memberP/save");
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO, Model model) {
        memberService.save(memberDTO);
        model.addAttribute("memberName", memberDTO.getMemberName());
        return ("memberP/login");
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "memberP/login";
    }

    @PostMapping("/login")
    public @ResponseBody String login(@RequestParam String memberName, @RequestParam String memberPassword, HttpSession session) {
        MemberDTO newMemberDTO = memberService.findByName(memberName);
        System.out.println(newMemberDTO);
        if (newMemberDTO == null) {
            return "NoId";
        } else if (!memberPassword.equals(newMemberDTO.getMemberPassword())) {
            return "NoPw";
        } else {
            session.setAttribute("memberName", newMemberDTO.getMemberName());
            session.setAttribute("memberId", newMemberDTO.getMemberId());
            return "Ok";
        }

    }


    @GetMapping("/logout")
    public String logout(HttpSession httpSession) {
        httpSession.removeAttribute("memberName");
        httpSession.removeAttribute("memberId");
        return "index";
    }

    @PostMapping("/nameDup")
    public @ResponseBody boolean nameDup(@RequestParam("memberName") String memberName) {
        return memberService.nameDup(memberName);
    }


}
