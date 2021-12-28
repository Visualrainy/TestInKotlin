package com.tw.cn

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @BeforeEach
    fun init() {
        calculator = Calculator(5)
    }

    @Test
    fun should_plus_correctly() {
        val result = calculator + 5
        assertEquals(10, result)
    }

    @Test
    fun should_add_correctly() {
        val result = calculator add 10
        assertEquals(15, result)
    }
}