package com.scs.soft.zhihu.app.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/16
 */
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followersCount;
    private Date updated;
}
