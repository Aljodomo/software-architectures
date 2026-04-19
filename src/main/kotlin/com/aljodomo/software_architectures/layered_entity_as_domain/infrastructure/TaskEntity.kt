package com.aljodomo.software_architectures.layered_entity_as_domain.infrastructure

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity(name = "LayeredEntityAsDomainTaskEntity")
@Table(name = "tasks")
class TaskEntity(
    @Id
    val id: UUID,
    val title: String,
    val description: String
)
