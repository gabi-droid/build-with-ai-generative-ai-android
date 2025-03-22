package com.google.ai.sample

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.Alignment

// Data class to store user responses
data class UserResponse(
    val question1: String,
    val question2: String
)

@Composable
fun QuestionScreen(onSubmit: (UserResponse) -> Unit) {
    var answer1 by remember { mutableStateOf("") }
    var answer2 by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Question 1: What is your name?")
        BasicTextField(
            value = answer1,
            onValueChange = { answer1 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 2: What is your favorite color?")
        BasicTextField(
            value = answer2,
            onValueChange = { answer2 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer2))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Button(
            onClick = { onSubmit(UserResponse(answer1, answer2)) },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Submit")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun QuestionScreenPreview() {
    QuestionScreen { response ->
        println("User submitted: $response")
    }
}
