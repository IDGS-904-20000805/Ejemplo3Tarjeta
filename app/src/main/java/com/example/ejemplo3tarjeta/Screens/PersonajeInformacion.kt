package com.example.ejemplo3tarjeta.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.example.ejemplo3tarjeta.Screens.PersonajeTarjeta

@Composable
fun PersonajeInfo(personaje: PersonajeTarjeta) {
    Column {
        Text(
            text = personaje.nombre,
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = personaje.descripcion,
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}