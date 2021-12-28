package com.tw.cn

class Calculator(private val source: Int) {
    infix fun add(number: Int): Int {
        return source + number
    }

    operator fun plus(number: Int): Int {
        return source + number
    }
}