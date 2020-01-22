package com.scs.soft.zhihu.app;

import com.scs.soft.zhihu.app.entity.Special;
import com.scs.soft.zhihu.app.mapper.SpecialMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ABC
 * @date 2020/1/16 16:35
 */
@SpringBootTest(classes = ZhihuAppApplication.class)

class SpecialMapperTest {
    @Resource
    private SpecialMapper specialMapper;

    @Test
    void selectAll(){
        List<Map> specials =specialMapper.selectAll();
        specials.forEach(System.out::println);
    }
    @Test
    void selectRecent(){
        List<Special> specials = specialMapper.selectRecent();
        specials.forEach(System.out::println);
    }
}
