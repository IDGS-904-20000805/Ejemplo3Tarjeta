package com.example.ejemplo3tarjeta.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.ejemplo3tarjeta.Screens.PersonajeTarjeta
import com.example.ejemplo3tarjeta.Screens.PersonajeCard

@Composable
fun TarjetasLista(personajes: List<PersonajeTarjeta>) {
    LazyColumn {
        items(personajes) { personaje ->
            PersonajeCard(personaje)
        }
    }
}