package com.example.githubdagger

import android.app.Application
import com.example.githubdagger.dagger.component.DaggerAppComponent

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        var component = DaggerAppComponent.create()
    }
}