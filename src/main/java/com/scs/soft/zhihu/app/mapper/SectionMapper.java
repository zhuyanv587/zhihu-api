package com.scs.soft.zhihu.app.mapper;

import com.scs.soft.zhihu.app.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/16
 */
public interface SectionMapper {
    /**
     * 根据专题id查询标签列表
     *
     * @param specialId
     * @return List<Section>
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId} ")
    List<Section> getSectionsBySpecialId(String specialId);
}
