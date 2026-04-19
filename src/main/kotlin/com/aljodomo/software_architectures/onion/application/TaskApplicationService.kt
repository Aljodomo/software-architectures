package com.aljodomo.architecture_comparison.onion.application

import com.aljodomo.architecture_comparison.onion.domain.Task
import com.aljodomo.architecture_comparison.onion.domain.TaskDomainService
import com.aljodomo.architecture_comparison.onion.domain.TaskRepository
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
