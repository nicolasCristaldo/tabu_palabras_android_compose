package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.nicolascristaldo.tabupalabras.R

@Composable
fun ConfigTextField(
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    modifier: Modifier = Modifier
) {
    var newName by remember { mutableStateOf("") }

    OutlinedTextField(
        value = newName,
        onValueChange = {
            if (it.length <= 18) {
                onValueChange(it)
                newName = it
            }
        },
        singleLine = true,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        label = {
            Text(text = stringResource(R.string.team_name_label))
        },
        modifier = modifier
    )
}