package com.aljodomo.software_architectures.layered_entity_as_domain.presentation.dto

import com.aljodomo.software_architectures.layered_entity_as_domain.infrastructure.TaskEntity
import java.util.UUID

data class TaskDto(
    val id: UUID,
    val title: String,
    val description: String
) {
    companion object {
        fun from(entity: TaskEntity) = TaskDto(entity.id, entity.title, entity.description)
    }
}
