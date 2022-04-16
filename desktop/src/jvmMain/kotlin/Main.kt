import me.saurabh.common.App
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeJvmMultiplatform Desktop App"
    ) {
        MaterialTheme {
            App()
        }
    }
}