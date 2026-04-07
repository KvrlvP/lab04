package com.example.lab04

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySwitch() {
    var isOn by remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = if (isOn) "Activado" else "Desactivado",
            modifier = Modifier.padding(end = 8.dp)
        )
        Switch(
            checked = isOn,
            onCheckedChange = { isOn = it }
        )
    }
}