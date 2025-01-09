package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.*;

import java.io.*;
import java.util.Iterator;
import java.util.Map;

/**
 * @Description
 * @Author hjg
 * @Date 2025-01-09 20:43
 */
public abstract class ProcessTemplates extends DefaultTask {

    @Input
    public abstract Property<TemplateEngineType> getTemplateEngine();

    @InputFiles
    public abstract ConfigurableFileCollection getSourceFiles();

    @Nested
    public abstract TemplateData getTemplateData();

    @OutputDirectory
    public abstract DirectoryProperty getOutputDir();

    @TaskAction
    public void processTemplates() throws IOException {
        //由于只是测试代码，这里就不使用配置的input参数了
        System.out.println(getTemplateEngine().get().name());

        Iterator<File> it = getSourceFiles().iterator();
        while (it.hasNext()) {
            File file = it.next();
            System.out.println(file.getName() + "   " + file.getAbsolutePath());
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                //FileReader fr = new FileReader(file)
                br.lines().forEach(line -> System.out.println(line));
            }
        }

        try (FileWriter fw = new FileWriter(getOutputDir().file("hello.txt").get().getAsFile())) {
            TemplateData templateData = getTemplateData();
            String name = templateData.getName().get();
            fw.write("hello " + name + "\n");

            Map<String, String> map = templateData.getVariables().get();
            if (map != null) {
                Iterator<Map.Entry<String, String>> entryIt = map.entrySet().iterator();
                while (entryIt.hasNext()) {
                    Map.Entry<String, String> entry = entryIt.next();
                    fw.write(entry.getKey() + "  " + entry.getValue());
                    fw.write("\n");
                }
            }
        }
    }

}
