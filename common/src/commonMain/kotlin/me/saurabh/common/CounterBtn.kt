package me.saurabh.common

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun CounterBtn() {
    val count = remember { mutableStateOf(0) }

    Button(onClick = { count.value++ }) {
        val btnText = if (count.value == 0) {
            "Hello ${getPlatformName()}!"
        } else {
            "Clicked ${count.value}!"
        }
        Text(btnText)
    }
}