package com.scs.soft.zhihu.app.service.Impl;

import com.scs.soft.zhihu.app.entity.RoundTable;
import com.scs.soft.zhihu.app.mapper.RoundTableMapper;
import com.scs.soft.zhihu.app.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoundTableImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;

    @Override
    public List<RoundTable> getAllRoundTable() {
        return roundTableMapper.getAllRoundTable();
    }

    @Override
    public List<RoundTable> getRoundTable() {
        return roundTableMapper.getRoundTable();
    }
}
