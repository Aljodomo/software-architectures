package com.aljodomo.software_architectures.cqrs.infrastructure

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface TaskJpaRepository : JpaRepository<TaskEntity, UUID>
