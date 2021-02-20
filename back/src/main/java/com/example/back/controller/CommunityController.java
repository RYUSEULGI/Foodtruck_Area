package com.example.back.controller;

import com.example.back.entity.Community;
import com.example.back.service.CommunityService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class CommunityController {
    private static final Logger log = LoggerFactory.getLogger(CommunityController.class);

    @Autowired
    private CommunityService service;

    // community 정보 이용
    @RequestMapping(value = "community", method = RequestMethod.GET, params = "write")
    public String getWrite(Community community) {
        log.info("getWrite()");

        return "nav/community/write";
    }

    @RequestMapping(value = "community", method = RequestMethod.POST)
    public String doWrite(Community community, Model model) throws Exception {
        log.info("doWrite()");
        service.write(community);
        model.addAttribute("msg", "등록이 완료되었습니다.");

        return "nav/community/success";
    }
}
