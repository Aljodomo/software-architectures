package com.aljodomo.software_architectures.layered_entity_only.application

import com.aljodomo.software_architectures.layered_entity_only.infrastructure.TaskEntity
import com.aljodomo.software_architectures.layered_entity_only.infrastructure.TaskJpaRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class TaskService(
    private val taskJpaRepository: TaskJpaRepository
) {

    fun createTask(title: String, description: String): TaskEntity =
        taskJpaRepository.save(TaskEntity(id = UUID.randomUUID(), title = title, description = description))

    fun getAllTasks(): List<TaskEntity> = taskJpaRepository.findAll()
}
