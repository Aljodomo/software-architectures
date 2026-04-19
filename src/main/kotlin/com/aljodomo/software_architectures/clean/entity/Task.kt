package com.aljodomo.software_architectures.clean.entity

import java.util.UUID

data class Task(
    val id: UUID,
    val title: String,
    val description: String
)
