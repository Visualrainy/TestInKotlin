package com.tw.cn.login

class LoginService(private val loginRepo: LoginRepository) {
    companion object {
        const val SUCCESS = 200
    }
    fun login(mobile: String, verifyCode: String): Boolean {
        val response = loginRepo.login(LoginRequest(mobile, verifyCode))
        return response.status == SUCCESS
    }
}