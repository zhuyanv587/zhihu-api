package com.scs.soft.zhihu.app.controller;

import com.scs.soft.zhihu.app.common.Result;
import com.scs.soft.zhihu.app.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/14
 */
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping(value = "/all")
    public Result getAllRoundTable(){
        return Result.success(roundTableService.getAllRoundTable());
    }

    @GetMapping
    public Result getRoundTable(){
        return Result.success(roundTableService.getRoundTable());
    }
}