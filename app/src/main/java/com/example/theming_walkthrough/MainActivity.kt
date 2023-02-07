package com.example.theming_walkthrough

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.theming_walkthrough.ui.theme.Theming_walkthroughTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Theming_walkthroughTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                        ThemeApp()
                }
            }
        }
    }
}

@Composable
fun ThemeApp() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Theme",
            style = MaterialTheme.typography.h5,
            modifier = appModifier
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = appModifier,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Button(onClick = { /*TODO*/ }, modifier = appModifier) {
            Text(
                text = "Submit",
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center

            )

        }

    }
}
