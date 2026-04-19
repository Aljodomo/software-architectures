package com.aljodomo.architecture_comparison.onion

import com.aljodomo.architecture_comparison.onion.domain.TaskDomainService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OnionConfig {

    @Bean
    fun taskDomainService(): TaskDomainService = TaskDomainService()
}
