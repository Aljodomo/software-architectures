package com.aljodomo.architecture_comparison.hexagonal

import com.aljodomo.architecture_comparison.hexagonal.core.TaskRepoPort
import com.aljodomo.architecture_comparison.hexagonal.core.TaskService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HexagonalConfig {

    @Bean
    fun taskService(taskRepoPort: TaskRepoPort): TaskService = TaskService(taskRepoPort)
}