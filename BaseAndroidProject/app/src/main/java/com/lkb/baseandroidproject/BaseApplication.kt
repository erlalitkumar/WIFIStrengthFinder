package com.lkb.baseandroidproject

import android.app.Application
import com.lkb.baseandroidproject.di.application.ApplicationComponent
import com.lkb.baseandroidproject.di.DaggerApplicationComponent

class BaseApplication:Application() {
    lateinit var mApplicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        mApplicationComponent = DaggerApplicationComponent.builder().build()
    }
    fun getApplicationComponent(): ApplicationComponent {
        return mApplicationComponent
    }

}