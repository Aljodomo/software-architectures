package com.aljodomo.architecture_comparison.layered_entity_as_domain.infrastructure

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface TaskJpaRepository : JpaRepository<TaskEntity, UUID>
