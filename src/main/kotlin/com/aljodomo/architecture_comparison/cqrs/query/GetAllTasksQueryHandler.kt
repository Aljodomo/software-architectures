package com.aljodomo.architecture_comparison.cqrs.query

import com.aljodomo.architecture_comparison.cqrs.infrastructure.TaskJpaRepository
import org.springframework.stereotype.Service

@Service
class GetAllTasksQueryHandler(
    private val taskJpaRepository: TaskJpaRepository
) {

    fun handle(@Suppress("UNUSED_PARAMETER") query: GetAllTasksQuery): List<TaskView> =
        taskJpaRepository.findAll().map { TaskView(it.id, it.title, it.description) }
}
