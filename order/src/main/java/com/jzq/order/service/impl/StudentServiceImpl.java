package com.jzq.order.service.impl;

import com.jzq.order.bean.StudentBO;
import com.jzq.order.dao.StudentMapper;
import com.jzq.order.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jian zhi qiang
 * @date 2021/6/2 23:03
 * @description 
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void save(StudentBO studentBO) {
        studentMapper.saveStudent(studentBO);
    }
}
