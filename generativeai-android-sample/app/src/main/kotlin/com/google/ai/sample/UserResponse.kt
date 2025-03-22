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
    var answer3 by remember { mutableStateOf("") }
    var answer4 by remember { mutableStateOf("") }
    var answer5 by remember { mutableStateOf("") }
    var answer6 by remember { mutableStateOf("") }
    var answer7 by remember { mutableStateOf("") }
    var answer8 by remember { mutableStateOf("") }
    var answer9 by remember { mutableStateOf("") }
    var answer10 by remember { mutableStateOf("") }
    var answer11 by remember { mutableStateOf("") }
    var answer12 by remember { mutableStateOf("") }
    var answer13 by remember { mutableStateOf("") }
    var answer14 by remember { mutableStateOf("") }
    var answer15 by remember { mutableStateOf("") }
    var answer16 by remember { mutableStateOf("") }
    var answer17 by remember { mutableStateOf("") }
    var answer18 by remember { mutableStateOf("") }
    var answer19 by remember { mutableStateOf("") }
    var answer20 by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Question 1: What is your employment status? (Employed, Self-employed, Student, " +
                "Retired, Unemployed)")
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

        Text("Question 2: What is your primary source of income? (Salary, Freelance, Business, " +
                "Investments, Other)")
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

        Text("Question 3: What is your average monthly income?")
        BasicTextField(
            value = answer3
            ,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 4: How stable is your income? (Fixed, Variable, Seasonal, Unpredictable)")
        BasicTextField(
            value = answer4,
            onValueChange = { answer4 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 5: Do you have any secondary sources of income? If yes, how much on average?")
        BasicTextField(
            value = answer5,
            onValueChange = { answer5 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 6: Do you have any dependents (children, parents, spouse) you financially support?")
        BasicTextField(
            value = answer6,
            onValueChange = { answer6 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 7: How much do you spend on groceries each month?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 8: What is your average monthly utility bill cost? (Electricity, Water, Gas, Internet, etc.)")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 9: How much do you spend on transportation (fuel, public transport, car maintenance)?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 10: Do you have any regular subscriptions (Netflix, Spotify, Gym, Magazines, etc.)?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 11: How much do you spend on entertainment and dining out?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 12: How much do you spend on shopping (clothing, gadgets, accessories)?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 13: Do you set aside money for travel or vacations? If yes, how much per month?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 14: What is your total estimated monthly expenditure?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 15: Do you usually save money? (Yes/No)")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 16: Do you currently have savings? If yes, how much on average do you save per month?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 17: How much would you like to save per month?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 18: Are you currently investing in stocks, mutual funds, crypto, or real estate? If yes, how much per month?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 19: What is your biggest financial challenge? (Overspending, Low Income, Debt, Saving, Other)")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Text("Question 20: Are there any specific financial habits you want to improve?")
        BasicTextField(
            value = answer3,
            onValueChange = { answer3 = it },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onSubmit(UserResponse(answer1, answer3))
            }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.primary)
                .padding(8.dp)
        )

        Button(
            onClick = { onSubmit(UserResponse(answer1, answer2,answer3)) },
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
