package com.aljodomo.software_architectures.onion.domain

interface TaskRepository {
    fun save(task: Task): Task
    fun findAll(): List<Task>
}
