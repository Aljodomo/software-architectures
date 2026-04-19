package com.aljodomo.software_architectures.hexagonal.core

import java.util.UUID

class TaskService(
    private val taskRepoPort: TaskRepoPort
) : TaskPort {

    override fun createTask(title: String, description: String): Task {
        val task = Task(id = UUID.randomUUID(), title = title, description = description)
        return taskRepoPort.save(task)
    }

    override fun getAllTasks(): List<Task> {
        return taskRepoPort.findAll()
    }
}
