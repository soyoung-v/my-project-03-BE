package com.green.memo.application;

import com.green.memo.application.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/memo")
public class MemoController {
    private final MemoService memoService;

    @PostMapping
    public int postMemo(@RequestBody MemoPostReq req){
        return memoService.postMemo(req);
    }

    @GetMapping
    public List<MemoGetRes> getMemoList(){
        return memoService.getMamoList();
    }

    @GetMapping("/search")
    public List<MemoGetSearchRes> getMemoSearchList(@RequestParam String keyword){
        return memoService.getMemoSearchList(keyword);
    }

    @GetMapping("{id}")
    public MemoGetOneRes getMemoOne(@PathVariable int id){
        return memoService.getMemoOne(id);
    }

    @PutMapping
    public int putMemo(@RequestBody MemoPutReq req){
        return memoService.putMemo(req);
    }

    @DeleteMapping("{id}")
    public int delMemo(@PathVariable int id){
        return memoService.delMemo(id);
    }


}
