package me.saurabh.android

import me.saurabh.common.App
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import me.saurabh.common.Conversation
import me.saurabh.common.model.SampleData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                App()
            }
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    MaterialTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}