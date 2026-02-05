package com.green.memo.application;

import com.green.memo.application.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int postMemo(MemoPostReq req){
        return memoMapper.save(req);
    }

    public List<MemoGetRes> getMamoList(){
        return memoMapper.findAll();
    }

    public List<MemoGetSearchRes> getMemoSearchList(String keyword){
        return memoMapper.findSearch(keyword);
    }

    public MemoGetOneRes getMemoOne(int id){
        return memoMapper.findById(id);
    }

    public  int putMemo(MemoPutReq req){
        return memoMapper.update(req);
    }

    public int delMemo(int id){
        return memoMapper.delete(id);
    }
}
