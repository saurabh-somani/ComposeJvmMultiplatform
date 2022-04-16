package me.saurabh.common

import androidx.compose.ui.graphics.painter.Painter

expect fun getPlatformName(): String
expect fun getPainterResource(): Painter