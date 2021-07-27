package com.fis.moduleone

import org.junit.Assert.*
import org.junit.Test

class SubtractionTest {
    @Test
    fun subtraction_isCorrect() {
        val subtraction = Subtraction()
        assertEquals(5, subtraction.execute(10,5))
    }
}