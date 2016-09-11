package com.github.sfwn.boot.service

import com.github.sfwn.boot.common.Response
import com.github.sfwn.boot.service.model.User

/**
 * Created by sfwn on 9/5/16.
 */
interface UserAuthService {

    fun checkAuth(username: String, password: String): Response<User>
}