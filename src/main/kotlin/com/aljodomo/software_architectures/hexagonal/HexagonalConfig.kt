package com.aljodomo.software_architectures.hexagonal

import com.aljodomo.software_architectures.hexagonal.core.TaskRepoPort
import com.aljodomo.software_architectures.hexagonal.core.TaskService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HexagonalConfig {

    @Bean
    fun taskService(taskRepoPort: TaskRepoPort): TaskService = TaskService(taskRepoPort)
}