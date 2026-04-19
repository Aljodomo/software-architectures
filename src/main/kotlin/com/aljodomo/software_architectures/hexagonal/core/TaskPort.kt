package com.aljodomo.architecture_comparison.hexagonal.core

interface TaskPort {
    fun createTask(title: String, description: String): Task
    fun getAllTasks(): List<Task>
}
