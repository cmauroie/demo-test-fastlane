package com.fis.modulefour

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ASubtractionTest {
    @Test
    fun subtraction_isCorrect() {
        val subtraction = ASubtraction()
        assertEquals(5, subtraction.execute(10,5))
    }
}