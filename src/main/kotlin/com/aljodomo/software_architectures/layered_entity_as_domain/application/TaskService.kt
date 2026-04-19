package com.aljodomo.software_architectures.layered_entity_as_domain.application

import com.aljodomo.software_architectures.layered_entity_as_domain.infrastructure.TaskEntity
import com.aljodomo.software_architectures.layered_entity_as_domain.infrastructure.TaskJpaRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class TaskService(
    private val taskJpaRepository: TaskJpaRepository
) {

    fun createTask(title: String, description: String): TaskEntity {
        val entity = TaskEntity(id = UUID.randomUUID(), title = title, description = description)
        return taskJpaRepository.save(entity)
    }

    fun getAllTasks(): List<TaskEntity> = taskJpaRepository.findAll()
}
