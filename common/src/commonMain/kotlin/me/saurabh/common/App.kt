package me.saurabh.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import me.saurabh.common.model.SampleData

@Composable
fun App() {
    Column {
        CounterBtn()

        Spacer(modifier = Modifier.height(24.dp))

        Conversation(SampleData.conversationSample)
    }
}
