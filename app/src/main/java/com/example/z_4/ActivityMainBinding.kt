package com.example.z_4

import androidx.test.platform.app.InstrumentationRegistry

class ActivityMainBinding {
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.form_android", appContext.packageName)
    }


}

