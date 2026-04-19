package com.aljodomo.software_architectures.cqrs.command

import com.aljodomo.software_architectures.cqrs.infrastructure.TaskEntity
import com.aljodomo.software_architectures.cqrs.infrastructure.TaskJpaRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class CreateTaskCommandHandler(
    private val taskJpaRepository: TaskJpaRepository
) {

    fun handle(command: CreateTaskCommand): UUID {
        val id = UUID.randomUUID()
        taskJpaRepository.save(TaskEntity(id, command.title, command.description))
        return id
    }
}
