package com.fis.demotestfastline

import org.junit.Test

import org.junit.Assert.*


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class AdditionTest {
    @Test
    fun addition_isCorrect() {
        val addition = Addition()
        assertEquals(4, addition.execute(2,2))
    }
}