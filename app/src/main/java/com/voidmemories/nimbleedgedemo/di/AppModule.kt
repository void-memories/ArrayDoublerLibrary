package com.voidmemories.nimbleedgedemo.di

import com.voidmemories.doublearray.ArrayDoubler
import com.voidmemories.doublearray.ArrayDoublerFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun providesArrayDoubler(): ArrayDoubler = ArrayDoublerFactory().buildArrayDoubler()
}