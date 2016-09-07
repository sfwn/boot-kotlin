package com.github.sfwn.boot.extension.service.impl

import com.github.sfwn.boot.common.Response
import com.github.sfwn.boot.extension.service.UserAuthService
import com.github.sfwn.boot.service.model.User

/**
 * Created by sfwn on 9/5/16.
 */
class DefaultUserAuthServiceImpl : UserAuthService {

    init {
        println("DefaultUserAuthServiceImpl\n\n\n")
    }

    override fun checkAuth(username: String, password: String): Response<User> {
        // TODO
        val defaultUser = User()
        return Response.ok(defaultUser)
    }
}