package com.scs.soft.zhihu.app.controller;

import com.scs.soft.zhihu.app.common.Result;
import com.scs.soft.zhihu.app.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/16
 */
@RestController
@RequestMapping(value = "/app/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    @GetMapping
    public Result getRecent() {
        return Result.success(specialService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll() {
        return Result.success(specialService.selectAll());
    }
}
