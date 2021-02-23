package com.example.back.service;

import com.example.back.entity.Member;
import com.example.back.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    public MemberRepository memberRepo;

    @Override
    public void signup(Member member) throws Exception {
        memberRepo.create(member);
    }

}
