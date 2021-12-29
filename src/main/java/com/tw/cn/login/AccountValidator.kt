package com.tw.cn.login

import com.tw.cn.login.exception.InvalidMobileNumberException

class AccountValidator {
    fun validate(mobile: String) {
        if (mobile.length != LoginService.MOBILE_LENGTH) {
            throw InvalidMobileNumberException("invalid mobile number")
        }
    }

}
