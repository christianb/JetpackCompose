package com.jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

// https://developer.android.com/codelabs/jetpack-compose-basics
class ComposeActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ActivityScreenContent()
        }
    }
}

@Preview(showBackground = true, name = "Text preview")
@Composable
fun Preview() {
    ActivityScreenContent()
}

@Composable
private fun BaseContainer(content: @Composable () -> Unit) {
    BasicsCodelabTheme {
        // A surface container using the 'background' color from the theme
        content()
    }
}

@Composable
private fun ActivityScreenContent(names: List<String> = listOf("Android", "iOS")) {
    BaseContainer {
        val counterState = remember { mutableStateOf(0) }

        Column(modifier = Modifier.fillMaxHeight()) {
            Column(modifier = Modifier.weight(1f)) {
                for (name in names) {
                    Greeting(name)
                    Divider(color = Color.Black)
                }
            }
            Counter(
                count = counterState.value,
                updateCount = { newCount -> counterState.value = newCount })
        }
    }
}

@Composable
private fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier.padding(24.dp),
        style = MaterialTheme.typography.h1
    )
}

@Composable
private fun Counter(count: Int, updateCount: (Int) -> Unit) {
    Button(
        onClick = { updateCount(count + 1) },
        backgroundColor = if (count > 5) Color.Green else Color.White
    ) {
        Text("I've been clicked $count times")
    }
}