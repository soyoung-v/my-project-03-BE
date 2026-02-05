package com.green.memo.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemoGetSearchRes {
    private int id;
    private String title;
    private String createdAt;
}
