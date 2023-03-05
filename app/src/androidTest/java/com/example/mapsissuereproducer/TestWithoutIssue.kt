package com.example.mapsissuereproducer

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TestWithoutIssue {

    @Rule
    @JvmField
    val rule = createAndroidComposeRule<MainActivity>()

    @Test
    fun thisCrashes() {
        assert(true)
    }
}
