package com.example.back.controller;

import com.example.back.entity.Member;
import com.example.back.service.MemberServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.java.Log;

@Log
@Controller
public class MemberController {

    @Autowired
    public MemberServiceImpl service;

    @PostMapping("welcome")
    public String doSignup(Member member, Model model) throws Exception {
        log.info("doSignup()");
        service.signup(member);
        model.addAttribute("email", member.getUserEmail());

        return "nav/welcome";
    }
}
