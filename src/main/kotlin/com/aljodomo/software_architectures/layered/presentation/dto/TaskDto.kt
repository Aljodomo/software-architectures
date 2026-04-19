package com.aljodomo.architecture_comparison.layered.presentation.dto

import com.aljodomo.architecture_comparison.layered.domain.Task
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
