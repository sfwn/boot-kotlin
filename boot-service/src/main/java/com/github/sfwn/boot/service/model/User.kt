package com.github.sfwn.boot.service.model

import com.avaje.ebean.Model
import com.avaje.ebean.annotation.EnumValue
import com.github.sfwn.boot.service.model.base.BaseModel
import javax.persistence.Entity
import javax.persistence.Table

/**
 * Created by sfwn on 9/5/16.
 */
@Entity
@Table(name = "tb_users")
class User : BaseModel() {

    companion object {
        val find = object : Model.Find<Long, User>() {}
    }

    var mobile: String? = null

    var email: String? = null

    var nick: String? = null

    var password: String? = null

    enum class STATUS {
        @EnumValue("A") ACTIVE,
        @EnumValue("L") LOCKED
    }

    var status: STATUS? = null
}