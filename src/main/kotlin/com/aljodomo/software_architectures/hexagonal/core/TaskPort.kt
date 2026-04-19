package com.aljodomo.software_architectures.hexagonal.core

interface TaskPort {
    fun createTask(title: String, description: String): Task
    fun getAllTasks(): List<Task>
}
