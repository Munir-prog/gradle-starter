package com.mprog.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project


class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        addHelloTask(project)
    }

    void addHelloTask(Project project) {
        def map = [description: "Hello task", group: "dmdev", type: DefaultTask]
        project.task(map, "hello") {

            println "config phase. Task hello"

            doLast {
                println "Execution phase, Action 1"
            }

            doFirst {
                println "Execution phase, Action 2"
            }

            doLast {
                println "Execution phase, Action 3"
            }

            println "task: $description, group: $group, actions: $actions.size"
            println "path task: ${path}"
        }
    }
}