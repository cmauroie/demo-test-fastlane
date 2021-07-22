package com.fis.moduletwo

import org.junit.Assert.*
import org.junit.Test

class ExampleUniTest {
    @Test
    fun addition_isCorrect() {
        val division = Division()
        assertEquals(5, division.execute(10,2))
    }
}