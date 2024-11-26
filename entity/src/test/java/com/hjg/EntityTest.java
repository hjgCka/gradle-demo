package com.hjg;

import com.hjg.school.Student;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @Description
 * @Author hjg
 * @Date 2024-11-25 19:22
 */
public class EntityTest {

    @Test
    public void testStu() {
        Student stu = new Student();
        stu.setName("Jack");
        stu.setAge(10);

        Date now = new Date();
        stu.setBirthday(now);

        System.out.println(stu);
    }
}
