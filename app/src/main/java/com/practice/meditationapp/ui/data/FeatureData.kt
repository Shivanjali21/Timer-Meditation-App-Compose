package com.practice.meditationapp.ui.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class FeatureData(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
