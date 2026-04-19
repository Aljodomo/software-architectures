package com.aljodomo.software_architectures.clean.usecase.boundary.`in`

import com.aljodomo.software_architectures.clean.entity.Task

interface TaskInputBoundary {
    fun createTask(title: String, description: String): Task
    fun getAllTasks(): List<Task>
}
