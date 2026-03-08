package com.example.newsapp.models

data class lastNew(
    val id: Int,
    val title: String,
    val date: String
)

val lastNewsList = listOf(
    lastNew(id = 1, title = "El presidente de EE.UU. no muestra signos de arrepentimiento", date = "febrero 08 - 2024"),
    lastNew(id = 2, title = "Nueva ley de educación entra en vigor el próximo mes", date = "febrero 09 - 2024"),
    lastNew(id = 3, title = "Descubren nueva especie de ave en la selva amazónica", date = "febrero 10 - 2024"),
    lastNew(id = 4, title = "El equipo local gana el campeonato nacional de fútbol", date = "febrero 11 - 2024"),
    lastNew(id = 5, title = "Avances científicos en la cura contra enfermedades raras", date = "febrero 12 - 2024")
)
