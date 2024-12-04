package com.hjg.gradle.controller;

import com.hjg.school.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description
 * @Author hjg
 * @Date 2024-12-04 21:07
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public Student findStuByName(@RequestParam String name) {
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(20);
        stu.setBirthday(new Date());

        return stu;
    }
}
