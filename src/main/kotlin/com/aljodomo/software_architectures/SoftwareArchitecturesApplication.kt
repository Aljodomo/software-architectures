package com.aljodomo.architecture_comparison

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator

@SpringBootApplication
class ArchitectureComparisonApplication

fun main(args: Array<String>) {
    runApplication<ArchitectureComparisonApplication>(*args) {
        setBeanNameGenerator(FullyQualifiedAnnotationBeanNameGenerator())
    }
}
