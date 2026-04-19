package com.aljodomo.software_architectures.onion.domain

import java.util.UUID

class TaskDomainService {

    fun buildTask(title: String, description: String): Task =
        Task(id = UUID.randomUUID(), title = title, description = description)
}
