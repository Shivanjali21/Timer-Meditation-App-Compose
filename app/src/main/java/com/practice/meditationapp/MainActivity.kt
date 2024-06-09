package com.practice.meditationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.practice.meditationapp.ui.screens.LoginScreen
import com.practice.meditationapp.ui.screens.TimerScreen
import com.practice.meditationapp.ui.theme.MeditationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {
            MeditationAppTheme {
                //HomeScreen()
               //ScreenTime()
              LoginScreen()
            }
        }
    }
}

@Composable
fun ScreenTime() {
    Surface(
        color = Color(0xFF101010),
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            TimerScreen(
                totalTime = 100L * 1000L,
                handleColor = Color.Green,
                inActiveBarColor = Color.DarkGray,
                activeBarColor = Color(0xFF37B900),
                modifier = Modifier.size(200.dp)
            )
        }
    }
}