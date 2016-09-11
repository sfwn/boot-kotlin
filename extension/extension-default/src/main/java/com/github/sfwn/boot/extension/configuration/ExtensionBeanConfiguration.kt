package com.github.sfwn.boot.extension.configuration

import com.github.sfwn.boot.extension.service.impl.DefaultUserAuthServiceImpl
import com.github.sfwn.boot.service.UserAuthService
import com.github.sfwn.boot.service.UserService
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by sfwn on 9/5/16.
 */
@Configuration
open class ExtensionBeanConfiguration {

    @Bean
    @ConditionalOnMissingBean(UserService::class)
    open fun userAuthService(): UserAuthService {
        return DefaultUserAuthServiceImpl()
    }
}