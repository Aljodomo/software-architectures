package com.aljodomo.architecture_comparison.cqrs.query

import java.util.UUID

data class TaskView(
    val id: UUID,
    val title: String,
    val description: String
)
