package com.aljodomo.software_architectures.clean.usecase.interactor

import com.aljodomo.software_architectures.clean.entity.Task
import com.aljodomo.software_architectures.clean.usecase.boundary.`in`.TaskInputBoundary
import com.aljodomo.software_architectures.clean.usecase.boundary.out.TaskGateway
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class TaskInteractor(
    private val taskGateway: TaskGateway
) : TaskInputBoundary {

    override fun createTask(title: String, description: String): Task {
        val task = Task(id = UUID.randomUUID(), title = title, description = description)
        return taskGateway.save(task)
    }

    override fun getAllTasks(): List<Task> {
        return taskGateway.findAll()
    }
}
