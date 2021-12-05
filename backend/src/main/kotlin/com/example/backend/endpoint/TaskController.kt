package com.example.backend.endpoint

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TaskController {

    @GetMapping("/tasks")
    fun getTasks() = listOf(
        Task(1, "Task 1"),
        Task(2, "Task 2"),
        Task(3, "Task 3")
    )
}

data class Task(val id: Int, val name: String)