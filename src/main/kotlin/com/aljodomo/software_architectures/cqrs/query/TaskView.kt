package com.aljodomo.software_architectures.cqrs.query

import java.util.UUID

data class TaskView(
    val id: UUID,
    val title: String,
    val description: String
)
