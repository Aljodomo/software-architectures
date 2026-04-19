package com.aljodomo.architecture_comparison.layered_entity_only.infrastructure

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity(name = "LayeredEntityOnlyTaskEntity")
@Table(name = "tasks")
class TaskEntity(
    @Id
    val id: UUID,
    val title: String,
    val description: String
)
