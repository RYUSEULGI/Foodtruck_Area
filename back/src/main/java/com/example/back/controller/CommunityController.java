package com.example.back.controller;

import java.util.List;

import com.example.back.entity.Community;
import com.example.back.service.CommunityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.extern.java.Log;

@Log
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
@RestController
@RequestMapping("/communities")
public class CommunityController {

    @Autowired
    private CommunityService service;

    @GetMapping("")
    public ResponseEntity<List<Community>> getList() throws Exception {
        log.info("get CommunityList()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Community> doWrite(@Validated @RequestBody Community community,
            UriComponentsBuilder uriBuilder) throws Exception {
        log.info("doWrite()");
        service.write(community);

        return new ResponseEntity<>(community, HttpStatus.OK);
    }

    @DeleteMapping("/{listNo}")
    public ResponseEntity<Void> remove(@PathVariable("listNo") int listNo) throws Exception {
        log.info("doRemove()");
        service.remove(listNo);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{listNo}")
    public ResponseEntity<Community> modify(@PathVariable("listNo") int listNo,
            @Validated @RequestBody Community community) throws Exception {
        log.info("getModify()");
        community.setListNo(listNo);
        service.modify(community);

        return new ResponseEntity<>(community, HttpStatus.OK);
    }

    @GetMapping("/{listNo}")
    public ResponseEntity<Community> comment(@PathVariable("listNo") int listNo) throws Exception {
        log.info("getComment()");
        Community community = service.comment(listNo);

        return new ResponseEntity<Community>(community, HttpStatus.OK);
    }

}
