package com.aljodomo.software_architectures.onion.infrastructure

import com.aljodomo.software_architectures.onion.domain.Task
import com.aljodomo.software_architectures.onion.domain.TaskRepository
import org.springframework.stereotype.Repository

@Repository
class PostgresTaskRepository(
    private val taskJpaRepository: TaskJpaRepository
) : TaskRepository {

    override fun save(task: Task): Task {
        val saved = taskJpaRepository.save(TaskEntity(task.id, task.title, task.description))
        return Task(saved.id, saved.title, saved.description)
    }

    override fun findAll(): List<Task> =
        taskJpaRepository.findAll().map { Task(it.id, it.title, it.description) }
}
