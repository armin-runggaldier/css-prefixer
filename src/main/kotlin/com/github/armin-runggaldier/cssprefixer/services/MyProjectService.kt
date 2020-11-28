package com.github.armin-runggaldier.cssprefixer.services

import com.intellij.openapi.project.Project
import com.github.armin-runggaldier.cssprefixer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
