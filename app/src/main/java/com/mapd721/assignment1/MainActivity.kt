package com.mapd721.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mapd721.assignment1.ui.theme.Assignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   Main()
                }
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
private fun Main() {
    val keyboardController = LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier.clickable { keyboardController?.hide() },
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Assignment 1", fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = "",
            onValueChange = "",
            label = { Text(text = "Username") },
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = "",
            onValueChange = "",
            label = { Text("Email") },
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = "",
            onValueChange = "",
            label = { Text("ID") },
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row {
            Button(
                onClick = {

                }
            ) {
                Text(text = "Load")
            }

            Spacer(modifier = Modifier.width(15.dp))

            Button(
                onClick = {

                }
            ){
                Text(text = "Save")
            }

            Spacer(modifier = Modifier.width(15.dp))

            Button(
                onClick = {

                }
            ) {
                Text(text = "Clear")
            }
            Spacer(modifier = Modifier.height(100.dp))

            Card(
                modifier = Modifier
                    .width(300.dp)
                    .heightIn(min = 56.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Text(text = "Anjali Thapa Magar", fontWeight = FontWeight.Bold)
                    Text(text = "301372527", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}