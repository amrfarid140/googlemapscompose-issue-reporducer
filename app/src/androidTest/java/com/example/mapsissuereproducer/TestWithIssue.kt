package com.example.mapsissuereproducer

import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule

import org.junit.Test
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TestWithIssue {

    @Rule
    @JvmField
    val rule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun thisCrashes() {
        rule.activityRule.scenario.onActivity {
            it.startActivity(Intent(it, MainActivity::class.java))
        }
        assert(true)
    }
}
