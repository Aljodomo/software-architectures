package com.aljodomo.architecture_comparison.layered_entity_only.infrastructure

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface TaskJpaRepository : JpaRepository<TaskEntity, UUID>
