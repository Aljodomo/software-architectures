package com.aljodomo.software_architectures.clean.usecase.boundary.out

import com.aljodomo.software_architectures.clean.entity.Task

interface TaskGateway {
    fun save(task: Task): Task
    fun findAll(): List<Task>
}
