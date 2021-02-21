package com.example.back.controller;

import com.example.back.entity.Community;
import com.example.back.service.CommunityService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/community")
public class CommunityController {
    private static final Logger log = LoggerFactory.getLogger(CommunityController.class);

    @Autowired
    private CommunityService service;

    @GetMapping("/list")
    public String getCommunityList(Model model) throws Exception {
        log.info("getCommunityList()");
        model.addAttribute("list", service.list());

        return "nav/community/list";
    }

    @GetMapping("/write")
    public String getWrite(Community community) {
        log.info("getWrite()");

        return "nav/community/write";
    }

    @PostMapping("/list")
    public String doWrite(Community community, Model model) throws Exception {
        log.info("doWrite()");
        service.write(community);
        model.addAttribute("list", service.list());

        return "nav/community/list";
    }

    @GetMapping("/check")
    public String getRemove(Community community, Model model) throws Exception {
        log.info("getRemove()");
        model.addAttribute(community.getListNo());
        log.info("listNo" + community.getListNo());

        return "nav/community/check";
    }

    @PostMapping("/remove")
    public String doRemove(int listNo, Model model) throws Exception {
        log.info("doRemove()");
        service.remove(listNo);
        model.addAttribute("msg", "삭제 되었습니다.");

        return "nav/community/success";
    }

    @GetMapping("/modify")
    public String getModify(int listNo, Model model) throws Exception {
        log.info("getModify()");

        model.addAttribute(service.comment(listNo));

        return "nav/community/modify";
    }

    @GetMapping("/comment")
    public String getComment(int listNo, Model model) throws Exception {
        log.info("getComment()");
        model.addAttribute(service.comment(listNo));

        return "nav/community/comment";
    }

}
