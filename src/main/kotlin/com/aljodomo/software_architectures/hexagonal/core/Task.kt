package com.aljodomo.architecture_comparison.hexagonal.core

import java.util.UUID

data class Task(
    val id: UUID,
    val title: String,
    val description: String
)
