package com.example.kotlinspringapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringAppApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringAppApplication>(*args)
}
