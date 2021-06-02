package com.jzq.order.dao;

import com.jzq.order.bean.StudentBO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author jian zhi qiang
 * @date 2021/6/2 23:00
 * @description 
 */
@Mapper
public interface StudentMapper {
    void saveStudent(StudentBO studentBO);
}
