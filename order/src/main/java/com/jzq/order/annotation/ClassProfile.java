package com.jzq.order.annotation;

import java.lang.annotation.*;

/**
 * @author jian zhi qiang
 * @date 2021/5/27 15:47
 * @description 类简介注解
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClassProfile {
    /**
     * 描述类的作用
     */
    String value() default "";
}
