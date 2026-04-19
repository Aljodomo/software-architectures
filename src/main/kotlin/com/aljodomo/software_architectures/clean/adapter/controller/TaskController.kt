package com.aljodomo.software_architectures.clean.adapter.controller

import com.aljodomo.software_architectures.clean.adapter.controller.dto.TaskCreateDto
import com.aljodomo.software_architectures.clean.adapter.controller.dto.TaskDto
import com.aljodomo.software_architectures.clean.usecase.boundary.`in`.TaskInputBoundary
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clean/tasks")
class TaskController(
    private val taskInputBoundary: TaskInputBoundary
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTask(@RequestBody request: TaskCreateDto): TaskDto =
        TaskDto.from(taskInputBoundary.createTask(request.title, request.description))

    @GetMapping
    fun getAllTasks(): List<TaskDto> =
        taskInputBoundary.getAllTasks().map(TaskDto.Companion::from)
}
