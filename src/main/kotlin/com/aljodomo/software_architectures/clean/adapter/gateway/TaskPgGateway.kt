package com.aljodomo.architecture_comparison.clean.adapter.gateway

import com.aljodomo.architecture_comparison.clean.entity.Task
import com.aljodomo.architecture_comparison.clean.framework.persistence.TaskEntity
import com.aljodomo.architecture_comparison.clean.framework.persistence.TaskJpaRepository
import com.aljodomo.architecture_comparison.clean.usecase.boundary.out.TaskGateway
import org.springframework.stereotype.Component

@Component
class TaskPgGateway(
    private val taskJpaRepository: TaskJpaRepository
) : TaskGateway {

    override fun save(task: Task): Task {
        val saved = taskJpaRepository.save(TaskEntity(task.id, task.title, task.description))
        return Task(saved.id, saved.title, saved.description)
    }

    override fun findAll(): List<Task> =
        taskJpaRepository.findAll().map { Task(it.id, it.title, it.description) }
}
