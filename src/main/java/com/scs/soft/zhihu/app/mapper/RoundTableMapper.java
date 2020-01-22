package com.scs.soft.zhihu.app.mapper;

import com.scs.soft.zhihu.app.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/14
 */
public interface RoundTableMapper {
    /**
     * 查询所有圆桌讨论
     * @return
     */
    @Select(" SELECT * FROM t_round_table ")
    List<RoundTable> getAllRoundTable();

    /**
     * 查询前4个圆桌讨论
     */
    @Select(" SELECT * FROM t_round_table ORDER BY visits_count DESC LIMIT 0,4 ")
    List<RoundTable> getRoundTable();
}

