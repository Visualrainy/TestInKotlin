package com.tw.cn.login

import com.tw.cn.login.exception.InvalidMobileNumberException
import com.tw.cn.login.model.LoginResponse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.kotlin.*

internal class LoginServiceTest {

    private lateinit var loginRepo: LoginRepository
    private lateinit var validator: AccountValidator
    private lateinit var loginService: LoginService

    @BeforeEach
    fun setUp() {
        loginRepo = mock()
        validator = mock()
        val userRepoDummy = UserRepository()
        loginService = LoginService(loginRepo, userRepoDummy, validator)
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

    @Test
    fun should_throw_exception_when_mobile_is_illegal() {
        whenever(validator.validate("1800828")).doAnswer { throw InvalidMobileNumberException("invalid mobile number") }
        assertThrows<InvalidMobileNumberException> {
            loginService.login("1800828", "123456")
            //below code will not be called
            verify(loginRepo, times(0)).login(any())
            verify(loginRepo, times(0)).release()
        }
    }
}