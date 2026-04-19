package com.aljodomo.software_architectures.layered.domain

interface TaskRepository {
    fun save(task: Task): Task
    fun findAll(): List<Task>
}
