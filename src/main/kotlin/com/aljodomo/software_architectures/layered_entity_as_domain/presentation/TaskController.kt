package com.aljodomo.architecture_comparison.layered_entity_as_domain.presentation

import com.aljodomo.architecture_comparison.layered_entity_as_domain.application.TaskService
import com.aljodomo.architecture_comparison.layered_entity_as_domain.presentation.dto.TaskCreateDto
import com.aljodomo.architecture_comparison.layered_entity_as_domain.presentation.dto.TaskDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/layered-no-domain/tasks")
class TaskController(
    private val taskService: TaskService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTask(@RequestBody request: TaskCreateDto): TaskDto =
        TaskDto.from(taskService.createTask(request.title, request.description))

    @GetMapping
    fun getAllTasks(): List<TaskDto> =
        taskService.getAllTasks().map(TaskDto::from)
}
