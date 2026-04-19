package com.aljodomo.architecture_comparison.cqrs.command

data class CreateTaskCommand(
    val title: String,
    val description: String
)
