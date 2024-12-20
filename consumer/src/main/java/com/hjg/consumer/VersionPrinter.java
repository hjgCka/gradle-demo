package com.hjg.consumer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

/**
 * @Description
 * @Author hjg
 * @Date 2024-12-20 15:21
 */
public class VersionPrinter {

    public static void main(String[] args) throws IOException {
        System.out.println("xxxx");

        Properties prop = new Properties();
        InputStream inputStream = VersionPrinter.class.getResourceAsStream("/build-info.properties");
        prop.load(inputStream);

        System.out.println(prop.getProperty("version"));

        inputStream.close();

        //java.class.path
        String clsPath = System.getProperty("java.class.path");
        if (clsPath != null) {
            String[] array = clsPath.split(File.pathSeparator);
            Arrays.stream(array).forEach(System.out::println);
        } else {
            System.out.println("No classpath found");
        }

        /**
         * D:\github\gradle_demos\java_demos\consumer\build\classes\java\main
         * D:\github\gradle_demos\java_demos\consumer\build\resources\main
         * D:\github\gradle_demos\java_demos\producer\build\libs\producer-1.0-SNAPSHOT.jar
         */
        //其中 build-info.properties，就存在于producer-1.0-SNAPSHOT.jar的根目录下
    }
}
