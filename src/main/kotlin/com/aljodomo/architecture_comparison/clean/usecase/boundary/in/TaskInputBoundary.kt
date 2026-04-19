package com.aljodomo.architecture_comparison.clean.usecase.boundary.`in`

import com.aljodomo.architecture_comparison.clean.entity.Task

interface TaskInputBoundary {
    fun createTask(title: String, description: String): Task
    fun getAllTasks(): List<Task>
}
