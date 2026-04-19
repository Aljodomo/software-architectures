package com.aljodomo.architecture_comparison.hexagonal.core

interface TaskRepoPort {
    fun save(task: Task): Task
    fun findAll(): List<Task>
}
