package com.example.back.service;

import java.util.List;

import com.example.back.entity.Community;

// 커뮤니티 게시판에 있어햐 하는 항목들 --> 인터페이스사용
public interface CommunityService {

    // 게시판을 리스트형식으로 관리하기
    public List<Community> list() throws Exception;

    public void write(Community community) throws Exception;

    public void remove(Integer listNo) throws Exception;

    public void modify(Community community) throws Exception;

    public Community comment(Integer listNo) throws Exception;
}