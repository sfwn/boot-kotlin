package com.github.sfwn.boot.service.model.base

import com.avaje.ebean.Model
import com.avaje.ebean.annotation.CreatedTimestamp
import com.avaje.ebean.annotation.UpdatedTimestamp
import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

/**
 * Created by sfwn on 9/6/16.
 */
@MappedSuperclass
abstract class BaseModel : Model() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null

    @CreatedTimestamp
    open var createdAt: Date? = null

    @UpdatedTimestamp
    open var updatedAt: Date? = null
}