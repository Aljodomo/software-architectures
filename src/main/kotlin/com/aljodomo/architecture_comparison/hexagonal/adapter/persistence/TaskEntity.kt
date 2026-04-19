package com.aljodomo.architecture_comparison.hexagonal.adapter.persistence

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity(name = "HexagonalTaskEntity")
@Table(name = "tasks")
class TaskEntity(
    @Id
    val id: UUID,
    val title: String,
    val description: String
)
