package com.sf.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by ghostinmatrix on 2018/2/1.
 */

class HelloWorldPlugin : Plugin<Project> {
    
    override fun apply(project: Project) {
        project.tasks.create<DefaultTask>("hello", DefaultTask::class.java)
    }
    
}
