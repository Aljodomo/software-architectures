package com.aljodomo.software_architectures.cqrs.api

import com.aljodomo.software_architectures.cqrs.command.CreateTaskCommand
import com.aljodomo.software_architectures.cqrs.command.CreateTaskCommandHandler
import com.aljodomo.software_architectures.cqrs.query.GetAllTasksQuery
import com.aljodomo.software_architectures.cqrs.query.GetAllTasksQueryHandler
import com.aljodomo.software_architectures.cqrs.query.TaskView
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cqrs/tasks")
class TaskController(
    private val createTaskCommandHandler: CreateTaskCommandHandler,
    private val getAllTasksQueryHandler: GetAllTasksQueryHandler
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTask(@RequestBody request: TaskCreateDto): TaskView {
        val id = createTaskCommandHandler.handle(
            CreateTaskCommand(request.title, request.description)
        )
        return TaskView(id, request.title, request.description)
    }

    @GetMapping
    fun getAllTasks(): List<TaskView> =
        getAllTasksQueryHandler.handle(GetAllTasksQuery)
}
