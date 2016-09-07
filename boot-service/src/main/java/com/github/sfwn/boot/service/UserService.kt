package com.github.sfwn.boot.service

import com.github.sfwn.boot.service.model.User

/**
 * Created by sfwn on 9/5/16.
 */
interface UserService {

    fun register(user: User): Long
}