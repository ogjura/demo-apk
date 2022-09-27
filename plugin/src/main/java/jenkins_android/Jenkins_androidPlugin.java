/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jenkins_android;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

/**
 * A simple 'hello world' plugin.
 */
public class Jenkins_androidPlugin implements Plugin<Project> {
    public void apply(Project project) {
        // Register a task
        project.getTasks().register("greeting", task -> {
            task.doLast(s -> System.out.println("Hello from plugin 'jenkins_android.greeting'"));
        });
    }
}