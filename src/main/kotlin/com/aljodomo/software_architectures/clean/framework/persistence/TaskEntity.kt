package com.aljodomo.software_architectures.clean.framework.persistence

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity(name = "CleanTaskEntity")
@Table(name = "tasks")
class TaskEntity(
    @Id
    val id: UUID,
    val title: String,
    val description: String
)
