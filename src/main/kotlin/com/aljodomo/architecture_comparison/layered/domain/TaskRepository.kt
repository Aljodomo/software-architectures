package com.aljodomo.architecture_comparison.layered.domain

interface TaskRepository {
    fun save(task: Task): Task
    fun findAll(): List<Task>
}
