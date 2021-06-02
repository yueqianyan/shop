package com.jzq.order.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * @author jian zhi qiang
 * @date 2021/6/2 21:47
 * @description 
 */
@Data
@TableName("student")
public class StudentBO {
    @TableId
    private String id;
    private String name;
}
