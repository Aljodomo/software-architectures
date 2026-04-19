package com.aljodomo.architecture_comparison.hexagonal.adapter.persistence

import com.aljodomo.architecture_comparison.hexagonal.core.Task
import com.aljodomo.architecture_comparison.hexagonal.core.TaskRepoPort
import org.springframework.stereotype.Component

@Component
class TaskRepo(
    private val taskJpaRepository: TaskJpaRepository
) : TaskRepoPort {

    override fun save(task: Task): Task {
        val saved = taskJpaRepository.save(TaskEntity(task.id, task.title, task.description))
        return Task(saved.id, saved.title, saved.description)
    }

    override fun findAll(): List<Task> =
        taskJpaRepository.findAll().map { Task(it.id, it.title, it.description) }
}
