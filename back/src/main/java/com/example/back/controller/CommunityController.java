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
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/community")
public class CommunityController {
    private static final Logger log = LoggerFactory.getLogger(CommunityController.class);

    @Autowired
    private CommunityService service;

    // community 정보 이용
    // @RequestMapping(value = "community", method = RequestMethod.GET, params =
    // "write")
    // public String getWrite(Community community) {
    // log.info("getWrite()");

    // return "nav/community/write";
    // }

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

    // @RequestMapping(value = "main", method = RequestMethod.POST)
    // public String doWrite(Community community, Model model) throws Exception {
    // log.info("doWrite()");
    // service.write(community);
    // model.addAttribute("list", service.list());

    // return "nav/community/list";
    // }

    @PostMapping("/list")
    public String doWrite(Community community, Model model) throws Exception {
        log.info("doWrite()");
        service.write(community);
        model.addAttribute("list", service.list());

        return "nav/community/list";
    }

    @GetMapping("/check")
    public String getRemove(int listNo, Model model) throws Exception {
        log.info("getRemove()");
        // model.addAttribute(community.getListNo());
        model.addAttribute(service.comment(listNo));
        return "nav/community/check";
    }

    @PostMapping("/remove")
    public String doRemove(int listNo, Model model) throws Exception {
        log.info("doRemove()");
        service.remove(listNo);

        return "nav/community/list";
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
