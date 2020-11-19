package com.github.sirwranwrap.tracetable.services

import com.intellij.openapi.project.Project
import com.github.sirwranwrap.tracetable.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
