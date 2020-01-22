package com.scs.soft.zhihu.app.service;

import com.scs.soft.zhihu.app.entity.RoundTable;

import java.util.List;

public interface RoundTableService {
    /**
     * 查询所有圆桌
     * @return
     */
    List<RoundTable> getAllRoundTable();

    /***
     * 查询前4个圆桌
     * @Return
     */
    List<RoundTable> getRoundTable();
}