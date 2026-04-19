package com.aljodomo.software_architectures.onion.application

import com.aljodomo.software_architectures.onion.domain.Task
import com.aljodomo.software_architectures.onion.domain.TaskDomainService
import com.aljodomo.software_architectures.onion.domain.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskApplicationService(
    private val taskDomainService: TaskDomainService,
    private val taskRepository: TaskRepository
) {

    fun createTask(title: String, description: String): Task {
        val task = taskDomainService.buildTask(title, description)
        return taskRepository.save(task)
    }

    fun getAllTasks(): List<Task> = taskRepository.findAll()
}
