package com.voidmemories.doublearray

import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class ArrayDoublerTest {
    private val mInputArray = floatArrayOf(1F, 2F, 3F, 4F, 5F)
    private val mExpectedOutputArray = floatArrayOf(2F, 4F, 6F, 8F, 10F)
    private lateinit var arrayDoubler: ArrayDoubler

    @Before
    fun setup() {
        arrayDoubler = ArrayDoublerFactory().buildArrayDoubler()
    }

    @Test
    fun should_return_doubled_array() {
        val actualValue = arrayDoubler.doubleThisArray(mInputArray)
        assertTrue(mExpectedOutputArray.contentEquals(actualValue))
    }
}