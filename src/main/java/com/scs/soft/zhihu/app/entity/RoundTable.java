package com.scs.soft.zhihu.app.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhuyan
 * @description TODO
 * @create 2020/1/14
 */
@Data
@Builder
public class RoundTable {
    private Integer roundId;
    private String name;
    private String banner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
