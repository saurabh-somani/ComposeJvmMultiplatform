package me.saurabh.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

actual fun getPlatformName(): String {
    return "Android"
}

@Composable
actual fun getPainterResource(): Painter {
    return painterResource(R.drawable.profile_picture)
}