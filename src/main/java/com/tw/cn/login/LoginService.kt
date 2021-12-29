package com.tw.cn.login

import com.tw.cn.login.model.LoginRequest

class LoginService(private val loginRepo: LoginRepository, private val userRepo: UserRepository, private val validator: AccountValidator) {
    companion object {
        const val SUCCESS = 200
        const val MOBILE_LENGTH = 11
    }
    fun login(mobile: String, verifyCode: String): Boolean {
        validator.validate(mobile)
        val response = loginRepo.login(LoginRequest(mobile, verifyCode))
        loginRepo.release()
        return response.status == SUCCESS
    }
}