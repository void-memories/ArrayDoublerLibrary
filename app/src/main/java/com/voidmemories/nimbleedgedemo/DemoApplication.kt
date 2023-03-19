package com.voidmemories.nimbleedgedemo

import android.app.Application
import com.voidmemories.nimbleedgedemo.di.AppComponent
import com.voidmemories.nimbleedgedemo.di.DaggerAppComponent

class DemoApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}