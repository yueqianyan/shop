package com.jzq.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jzq.order.bean.StudentBO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author jian zhi qiang
 * @date 2021/6/2 22:23
 * @description 
 */
public interface StudentService {
    void save(StudentBO studentBO);
}
