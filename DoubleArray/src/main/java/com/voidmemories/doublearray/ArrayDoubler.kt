package com.voidmemories.doublearray

interface ArrayDoubler {
    fun doubleThisArray(array: FloatArray): FloatArray
}

class ArrayDoublerFactory {
    fun buildArrayDoubler(): ArrayDoubler = ArrayDoublerImpl()
}

class ArrayDoublerImpl : ArrayDoubler {

    init {
        System.loadLibrary("doublearray")
    }

    private external fun doubleThisArrayNative(array: FloatArray): FloatArray

    override fun doubleThisArray(array: FloatArray): FloatArray {
        return doubleThisArrayNative(array)
    }

}
