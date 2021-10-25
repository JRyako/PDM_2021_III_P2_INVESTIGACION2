package hn.edu.ujcv.pdm_2021_iii_p2_investigacion2.ui.main

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class CalculatorTest : TestCase() {
    private lateinit var mCalculator: Calculator

    @Before
    override fun setUp() {
        mCalculator = Calculator()
    }

    @Test
    fun testDivide1() {
            assertEquals(83.33333333333334, mCalculator.divide(25.0, 0.30),0.0)
    }
    fun testDivide2() {
        assertEquals(50.0, mCalculator.divide(15.0, 0.30),0.0)
    }
    fun testDivide3() {
        assertEquals(65.0, mCalculator.divide(19.5, 0.30),0.0)
    }

    @Test
    fun testMultiply1() {
        assertEquals(24.99,mCalculator.multiply(83.3,0.3),0.0)
    }
    fun testMultiply2() {
        assertEquals(20.7,mCalculator.multiply(69.0,0.3),0.0)
    }
    fun testMultiply3() {
        assertEquals(28.5,mCalculator.multiply(95.0,0.3),0.0)
    }
}