package com.aljodomo.software_architectures.onion.ui.dto

import com.aljodomo.software_architectures.onion.domain.Task
import java.util.UUID

data class TaskDto(
    val id: UUID,
    val title: String,
    val description: String
) {
    companion object {
        fun from(task: Task) = TaskDto(task.id, task.title, task.description)
    }
}
