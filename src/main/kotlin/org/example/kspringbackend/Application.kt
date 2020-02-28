package org.example.kspringbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBackendApplication

fun main(args: Array<String>) {
    runApplication<KotlinBackendApplication>(*args)
}