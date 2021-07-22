package com.fis.moduleone

import org.junit.Assert.*
import org.junit.Test

class ExampleUniTest {
    @Test
    fun subtraction_isCorrect() {
        val subtraction = Subtraction()
        assertEquals(5, subtraction.execute(10,5))
    }
}