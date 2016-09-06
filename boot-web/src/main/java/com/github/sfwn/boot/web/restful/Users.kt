package com.github.sfwn.boot.web.restful

import com.github.sfwn.boot.service.UserService
import com.github.sfwn.boot.service.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by sfwn on 9/5/16.
 */
@RestController
@RequestMapping("/api/users")
class Users @Autowired constructor(
        private val userService: UserService
) {

    @RequestMapping("/register", method = arrayOf(RequestMethod.POST))
    fun register(user: User): User {
        val newUser = userService.register(user)
        return newUser
    }
}