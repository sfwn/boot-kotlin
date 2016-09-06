package com.github.sfwn.boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by sfwn on 9/5/16.
 */
@SpringBootApplication
open class Application

fun main(vararg args: String) {
    SpringApplication.run(Application::class.java, *args)
}
