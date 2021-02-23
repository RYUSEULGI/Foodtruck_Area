package com.example.back.repository;

import com.example.back.entity.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.extern.java.Log;

@Log
@Repository
public class MemberRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Member member) throws Exception {
        log.info("create new member()");

        String query = "insert into member(userEmail, userPw, userPhoneNumber) values(?,?,?)";

        jdbcTemplate.update(query, member.getUserEmail(), member.getUserPw(), member.getUserPhoneNumber());
    }
}
