package com.voidmemories.nimbleedgedemo.di

import com.voidmemories.nimbleedgedemo.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}