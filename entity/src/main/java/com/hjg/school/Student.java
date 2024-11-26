package com.hjg.school;

import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author hjg
 * @Date 2024-11-25 19:13
 */
@Data
public class Student {
    private String name;
    private Integer age;
    private Date birthday;
}
