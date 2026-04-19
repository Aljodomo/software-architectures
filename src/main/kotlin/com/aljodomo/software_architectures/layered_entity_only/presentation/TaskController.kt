package com.aljodomo.software_architectures.layered_entity_only.presentation

import com.aljodomo.software_architectures.layered_entity_only.application.TaskService
import com.aljodomo.software_architectures.layered_entity_only.infrastructure.TaskEntity
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/layered-entity-only/tasks")
class TaskController(
    private val taskService: TaskService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTask(@RequestBody request: TaskEntity): TaskEntity =
        taskService.createTask(request.title, request.description)

    @GetMapping
    fun getAllTasks(): List<TaskEntity> = taskService.getAllTasks()
}
