package com.example.back.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Community {
    private int listNo;
    private String contents;
    private String writer;
    private Date regDate;
}