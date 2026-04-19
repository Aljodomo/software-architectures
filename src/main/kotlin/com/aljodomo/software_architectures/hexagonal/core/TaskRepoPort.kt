package com.aljodomo.software_architectures.hexagonal.core

interface TaskRepoPort {
    fun save(task: Task): Task
    fun findAll(): List<Task>
}
