package com.nicolascristaldo.tabupalabras.ui.screens.config.components

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.window.Dialog
import com.nicolascristaldo.tabupalabras.R
import com.nicolascristaldo.tabupalabras.ui.theme.team1Color
import com.nicolascristaldo.tabupalabras.ui.theme.team2Color

@Composable
fun EditNameDialog(
    onTeam1NameChange: (String) -> Unit,
    onTeam2NameChange: (String) -> Unit,
    editingTeam: String?,
    changeEditingState: () -> Unit,
    modifier: Modifier = Modifier
) {
    val focusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current
    val onNameChange = if (editingTeam == "Equipo Rojo") onTeam1NameChange else onTeam2NameChange

    Dialog(
        onDismissRequest = { changeEditingState() }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .background(
                    color = if (editingTeam == "Equipo Rojo") team1Color else team2Color,
                    shape = RoundedCornerShape(dimensionResource(R.dimen.config_dialog_corner_radius))
                )
                .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            ConfigTextField(
                onValueChange = {
                    if(it.isEmpty()) { onNameChange(editingTeam!!) }
                    else { onNameChange(it) }
                },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                keyboardActions = KeyboardActions(
                    onDone = {
                        focusManager.clearFocus()
                        changeEditingState()
                    }
                ),
                modifier = Modifier.focusRequester(focusRequester)
            )
        }

        LaunchedEffect(editingTeam) {
            focusRequester.requestFocus()
        }

        BackHandler {
            focusManager.clearFocus()
            changeEditingState()
        }
    }
}