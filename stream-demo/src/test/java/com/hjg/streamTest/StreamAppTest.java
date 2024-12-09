package com.hjg.streamTest;

import com.hjg.school.Student;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author hjg
 * @Date 2024-11-26 17:09
 */
public class StreamAppTest {

    @Test
    public void streamAppTest() {
        Student student = new Student();
        student.setAge(12);
        student.setName("John");
        student.setBirthday(new Date());

        System.out.println(student);

        Set<String> sets = new HashSet<>();
        sets.clear();
        sets.add("aaa");
    }
}
