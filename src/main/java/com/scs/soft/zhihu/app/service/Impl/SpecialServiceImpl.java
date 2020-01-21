package com.scs.soft.zhihu.app.service.Impl;

import com.scs.soft.zhihu.app.entity.Special;
import com.scs.soft.zhihu.app.mapper.SpecialMapper;
import com.scs.soft.zhihu.app.service.SpecialService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/16
 */

public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;

    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return specialMapper.selectRecent();
    }
}
