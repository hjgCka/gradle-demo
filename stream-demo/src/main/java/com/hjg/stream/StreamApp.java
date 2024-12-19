package com.hjg.stream;

import com.hjg.school.Teacher;
import org.apache.commons.lang3.StringUtils;

/**
 * @Description
 * @Author hjg
 * @Date 2024-11-25 23:46
 */
public class StreamApp {

    public static String stringTrim(String str) {
        return StringUtils.trim(str);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Mark");
        teacher.setNum("20209838347834");

        System.out.println(teacher);

        System.out.println(stringTrim("  Hello Neo "));
    }
}
