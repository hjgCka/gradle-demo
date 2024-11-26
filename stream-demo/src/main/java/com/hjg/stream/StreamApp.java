package com.hjg.stream;

import com.hjg.school.Teacher;

/**
 * @Description
 * @Author hjg
 * @Date 2024-11-25 23:46
 */
public class StreamApp {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Mark");
        teacher.setNum("20209838347834");

        System.out.println(teacher);
    }
}
