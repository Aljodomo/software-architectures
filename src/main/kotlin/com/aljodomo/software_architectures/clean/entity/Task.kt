package com.aljodomo.architecture_comparison.clean.entity

import java.util.UUID

data class Task(
    val id: UUID,
    val title: String,
    val description: String
)
