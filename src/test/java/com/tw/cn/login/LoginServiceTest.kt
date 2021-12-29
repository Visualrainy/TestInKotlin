package com.tw.cn.login

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.kotlin.*

internal class LoginServiceTest {

    private lateinit var loginRepo: LoginRepository
    private lateinit var loginService: LoginService

    @BeforeEach
    fun setUp() {
        loginRepo = mock()
        loginService = LoginService(loginRepo)
    }

    @Test
    fun should_login_success_with_correct_request() {
        whenever(loginRepo.login(any())).thenReturn(LoginResponse(200))
        val result = loginService.login("18008219018", "123456")

        assertTrue(result)
    }

    @Test
    fun should_login_success_with_correct_request_test_spy() {
        whenever(loginRepo.login(any())).thenReturn(LoginResponse(200))
        loginService.login("18008219018", "123456")

        verify(loginRepo).release()
    }
}