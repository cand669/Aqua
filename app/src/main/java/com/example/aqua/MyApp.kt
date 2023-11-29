
package com.example.aqua

import android.app.Application
import android.content.Context
import com.example.aqua.utils.sdkinit.XBasicLibInit


class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initLibs()
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
    }

    private fun initLibs() {
        XBasicLibInit.init(this)
    }

    companion object {
        val isDebug: Boolean
            get() = true
    }
}