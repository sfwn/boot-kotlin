package com.github.sfwn.boot.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

/**
 * Created by sfwn on 9/5/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.github.sfwn.boot"))
open class Application

fun main(vararg args: String) {
    SpringApplication.run(Application::class.java, *args)
}
