package com.github.sfwn.boot.service.impl

import com.github.sfwn.boot.service.UserService
import com.github.sfwn.boot.service.model.User
import org.springframework.stereotype.Service

/**
 * Created by sfwn on 9/5/16.
 */
@Service
class UserServiceImpl : UserService {

    override fun register(user: User): User {
        // TODO
        return user
    }
}