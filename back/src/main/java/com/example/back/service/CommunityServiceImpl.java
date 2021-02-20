package com.example.back.service;

import java.util.List;

import com.example.back.entity.Community;
import com.example.back.repository.CommunityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// 인터페이스 상속 --> override로 사용하기
public class CommunityServiceImpl implements CommunityService {

    // 자동으로 주입할 대상
    @Autowired
    private CommunityRepository communityRepo;

    @Override
    public List<Community> list() throws Exception {
        return communityRepo.list();
    }

    @Override
    public void write(Community community) throws Exception {
        communityRepo.write(community);
    }

    @Override
    public void remove(Integer listNo) throws Exception {
        communityRepo.remove(listNo);
    }

    @Override
    public void modify(Community community) throws Exception {
        communityRepo.modify(community);
    }

    @Override
    public Community comment(Integer listNo) throws Exception {
        return communityRepo.comment(listNo);
    }

}
