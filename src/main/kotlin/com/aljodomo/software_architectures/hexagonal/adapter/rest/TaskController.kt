package com.aljodomo.software_architectures.hexagonal.adapter.rest

import com.aljodomo.software_architectures.hexagonal.core.TaskPort
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hexagonal/tasks")
class TaskController(
    private val taskPort: TaskPort
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTask(@RequestBody request: TaskCreateDto): TaskDto =
        TaskDto.from(taskPort.createTask(request.title, request.description))

    @GetMapping
    fun getAllTasks(): List<TaskDto> =
        taskPort.getAllTasks().map(TaskDto.Companion::from)
}
