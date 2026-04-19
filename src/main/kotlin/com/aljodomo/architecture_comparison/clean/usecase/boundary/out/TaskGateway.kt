package com.aljodomo.architecture_comparison.clean.usecase.boundary.out

import com.aljodomo.architecture_comparison.clean.entity.Task

interface TaskGateway {
    fun save(task: Task): Task
    fun findAll(): List<Task>
}
