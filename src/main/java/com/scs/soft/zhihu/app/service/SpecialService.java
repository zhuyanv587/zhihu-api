package com.scs.soft.zhihu.app.service;

import com.scs.soft.zhihu.app.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/16
 */

public interface SpecialService {
    /**
     * 查询所有专题
     *
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     *
     * @return List<Special>
     */
    List<Special> selectRecent();
}
