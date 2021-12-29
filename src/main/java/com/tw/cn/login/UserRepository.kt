package com.tw.cn.login

class UserRepository {
    fun fetchUserInfo(mobile: String): UserInfo {
        TODO("Not yet implemented")
    }

}


data class UserInfo(private val userName: String)
