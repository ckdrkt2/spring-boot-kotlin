package com.example.kotlin.chat

import com.example.kotlin.chat.service.MessageVM
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatKotlinApplication

fun main(args: Array<String>) {
    runApplication<ChatKotlinApplication>(*args)
}

interface Calc {
    val name: String
    fun add(a: Int, b: Int): Int
    fun sub(a: Int, b: Int): Int = a - b
}

class Calc2(override val name: String): Calc {
    override fun add(a: Int, b: Int) = a + b
}