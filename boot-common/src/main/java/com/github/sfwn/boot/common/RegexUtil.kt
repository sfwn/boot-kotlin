package com.github.sfwn.boot.common

/**
 * Created by sfwn on 9/6/16.
 */
object RegexUtil {
    private val EMAIL_REGEX = """..*@..*\..*""".toRegex()
    private val MOBILE_REGEX = """(^(13\d|14[57]|15[^4,\D]|17[13678]|18\d)\d{8}|170[^346,\D]\d{7})$""".toRegex()

    fun isEmail(email: String): Boolean {
        return EMAIL_REGEX.matches(email)
    }

    fun isMobile(mobile: String): Boolean {
        return MOBILE_REGEX.matches(mobile)
    }
}

fun main(args: Array<String>) {
    println(RegexUtil.isEmail("465755864@qq.com"))
}