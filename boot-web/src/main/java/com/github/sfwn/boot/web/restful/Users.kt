package com.github.sfwn.boot.web.restful

import com.github.sfwn.boot.common.RegexUtil
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
    fun register(mobile: String, password: String, email: String, nick: String): User {
        email
        mobile
        nick
        password
        if (!RegexUtil.isEmail(email)) throw IllegalArgumentException("invalid email")
        if (!RegexUtil.isMobile(mobile)) throw IllegalArgumentException("invalid mobile")
        val user = User().apply {
            this.mobile = mobile
            this.email = email
            this.nick = nick
            this.password = password
            this.status = User.STATUS.LOCKED
        }
        println("ok")
        return user
    }
}