package com.aljodomo.software_architectures.layered.application

import com.aljodomo.software_architectures.layered.domain.Task
import com.aljodomo.software_architectures.layered.domain.TaskRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class TaskService(
    private val taskRepository: TaskRepository
) {

    fun createTask(title: String, description: String): Task {
        val task = Task(id = UUID.randomUUID(), title = title, description = description)
        return taskRepository.save(task)
    }

    fun getAllTasks(): List<Task> = taskRepository.findAll()
}
