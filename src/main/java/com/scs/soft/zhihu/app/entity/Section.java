package com.scs.soft.zhihu.app.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/16
 */
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
