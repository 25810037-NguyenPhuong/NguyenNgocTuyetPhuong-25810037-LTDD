package com.example.marsphotos

import android.app.Application
import com.example.marsphotos.data.AppContainer
import com.example.marsphotos.data.DefaultAppContainer

/**
 * Lop Application tao container mot lan khi app khoi dong.
 * Phai khai bao android:name=".MarsPhotosApplication" trong AndroidManifest.xml
 */
class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
