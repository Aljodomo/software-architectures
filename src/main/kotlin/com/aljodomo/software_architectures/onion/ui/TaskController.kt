package com.aljodomo.architecture_comparison.onion.ui

import com.aljodomo.architecture_comparison.onion.application.TaskApplicationService
import com.aljodomo.architecture_comparison.onion.ui.dto.TaskCreateDto
import com.aljodomo.architecture_comparison.onion.ui.dto.TaskDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/onion/tasks")
class TaskController(
    private val taskApplicationService: TaskApplicationService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTask(@RequestBody request: TaskCreateDto): TaskDto =
        TaskDto.from(taskApplicationService.createTask(request.title, request.description))

    @GetMapping
    fun getAllTasks(): List<TaskDto> =
        taskApplicationService.getAllTasks().map(TaskDto.Companion::from)
}
