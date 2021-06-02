package com.jzq.order.controller;

import com.jzq.order.bean.StudentBO;
import com.jzq.order.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jian zhi qiang
 * @date 2021/6/2 22:33
 * @description 
 */
@RestController
@RequestMapping("/jzq")
public class StudentController {
    @Resource
    private StudentService studentService;

    @PostMapping("/saveStudent")
    public void saveStudent() {
        StudentBO studentBO = new StudentBO();
        studentBO.setName("华为");
        studentService.save(studentBO);
    }
}
