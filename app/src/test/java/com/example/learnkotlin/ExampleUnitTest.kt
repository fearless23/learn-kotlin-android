package com.example.learnkotlin

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_random_number() {
        val max = 10
        val dice = Dice(max)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and $max",
            rollResult in 1..max)
    }
}