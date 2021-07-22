package com.fis.modulethree

import org.junit.Assert.*
import org.junit.Test

class ExampleUniTest {
    @Test
    fun multiplication_isCorrect() {
        val multiplication = Multiplication()
        assertEquals(10, multiplication.execute(5,2))
    }
}