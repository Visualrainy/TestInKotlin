package com.tw.cn.login

class LoginService(private val loginRepo: LoginRepository) {
    fun login(mobile: String, verifyCode: String): LoginResponse {
        return loginRepo.login(LoginRequest(mobile, verifyCode))
    }
}