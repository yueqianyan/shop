package com.jzq.order.bean;

import com.jzq.order.annotation.ClassProfile;
import lombok.Data;

/**
 * @author jian zhi qiang
 * @date 2021/5/27 15:54
 * @description 
 */
@Data
@ClassProfile(value = "这是一个测试 bean 类")
public class TestBean {
    private String name;
}
