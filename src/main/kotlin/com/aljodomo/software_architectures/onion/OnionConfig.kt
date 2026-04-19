package com.aljodomo.software_architectures.onion

import com.aljodomo.software_architectures.onion.domain.TaskDomainService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OnionConfig {

    @Bean
    fun taskDomainService(): TaskDomainService = TaskDomainService()
}
