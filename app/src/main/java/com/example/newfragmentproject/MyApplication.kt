package com.example.newfragmentproject

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.Koin
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

class MainApplication : Application() {
    companion object {
        var koinApp: KoinApplication? = null
    }
    override fun onCreate() {
        super.onCreate()
        koinApp = startKoin {
            androidContext(this@MainApplication)
            modules(mainKoinModule)
        }
    }
}
