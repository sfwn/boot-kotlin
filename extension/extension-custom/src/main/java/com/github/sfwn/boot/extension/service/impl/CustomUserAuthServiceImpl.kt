package com.github.sfwn.boot.extension.service.impl

import com.github.sfwn.boot.common.Response
import com.github.sfwn.boot.service.UserAuthService
import com.github.sfwn.boot.service.model.User
import org.springframework.stereotype.Service

/**
 * Created by sfwn on 9/5/16.
 */
@Service
class CustomUserAuthServiceImpl : UserAuthService {

    init {
        println("CustomUserAuthServiceImpl\n\n\n")
    }

    override fun checkAuth(username: String, password: String): Response<User> {
        // TODO
        val customUser = User()
        return Response.ok(customUser)
    }
}