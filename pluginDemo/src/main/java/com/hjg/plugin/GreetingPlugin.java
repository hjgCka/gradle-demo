package com.hjg.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.provider.Property;

/**
 * @Description
 * @Author hjg
 * @Date 2025-01-01 12:32
 */
public class GreetingPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        GreetingPluginExtension extension = project.getExtensions().create("greeting", GreetingPluginExtension.class);
        project.task("hello", task -> {
            task.doLast(t -> {
                String message = extension.getMessage().get();
                String greeter = extension.getGreeter().get();
                System.out.println(message + " from " + greeter);
            });
        });
    }

}

interface GreetingPluginExtension {
    Property<String> getMessage();
    Property<String> getGreeter();
}
