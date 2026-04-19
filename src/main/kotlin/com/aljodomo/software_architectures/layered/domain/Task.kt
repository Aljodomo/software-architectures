package com.aljodomo.software_architectures.layered.domain

import java.util.UUID

data class Task(
    val id: UUID,
    val title: String,
    val description: String
)
