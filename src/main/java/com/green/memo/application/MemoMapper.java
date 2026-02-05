package com.green.memo.application;

import com.green.memo.application.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {
    int save(MemoPostReq req);
    List<MemoGetRes> findAll();
    List<MemoGetSearchRes> findSearch(String keyword);
    MemoGetOneRes findById(int id);
    int update(MemoPutReq req);
    int delete(int id);

}
