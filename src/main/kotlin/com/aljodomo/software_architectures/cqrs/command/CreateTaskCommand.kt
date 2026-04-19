package com.aljodomo.software_architectures.cqrs.command

data class CreateTaskCommand(
    val title: String,
    val description: String
)
