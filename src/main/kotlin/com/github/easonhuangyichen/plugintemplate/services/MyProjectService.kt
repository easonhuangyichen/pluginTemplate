package com.github.easonhuangyichen.plugintemplate.services

import com.intellij.openapi.project.Project
import com.github.easonhuangyichen.plugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
