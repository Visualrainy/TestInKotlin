package com.tw.cn.login

import com.tw.cn.login.model.LoginRequest
import com.tw.cn.login.model.LoginResponse

class LoginRepository {
    fun login(request: LoginRequest): LoginResponse {
        //todo implement remote service
        return LoginResponse(123)
    }

    fun release() {
        TODO("Not yet implemented")
    }
}