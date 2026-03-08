package com.example.newsapp.models

data class WorldNew(
    val id: Int,
    val title: String,
    val image: String,
)

val worldNewsList = listOf(
    WorldNew(
        id = 1,
        title = "El presidente de EE.UU. no muestra signos de arrepentimiento",
        image = "https://cdn.britannica.com/68/216668-050-DD3A9D0A/United-States-President-Donald-Trump-2017.jpg"
    ),
    WorldNew(
        id = 2,
        title = "NASA descubre un nuevo exoplaneta con atmósfera similar a la Tierra",
        image = "https://images.unsplash.com/photo-1614728894747-a83421e2b9c9?auto=format&fit=crop&w=800"
    ),
    WorldNew(
        id = 3,
        title = "La cumbre climática logra acuerdos históricos para reducir emisiones",
        image = "https://images.unsplash.com/photo-1464822759023-fed622ff2c3b?auto=format&fit=crop&w=800"
    ),
    WorldNew(
        id = 4,
        title = "Nueva tecnología de IA permite traducir idiomas en tiempo real con precisión",
        image = "https://images.unsplash.com/photo-1677442136019-21780ecad995?auto=format&fit=crop&w=800"
    ),
    WorldNew(
        id = 5,
        title = "El equipo de arqueología descubre una ciudad sumergida en el Mediterráneo",
        image = "https://images.unsplash.com/photo-1544551763-46a013bb70d5?auto=format&fit=crop&w=800"
    ),
    WorldNew(
        id = 6,
        title = "Avances en medicina genómica prometen curas para enfermedades raras",
        image = "https://images.unsplash.com/photo-1576086213369-97a306d36557?auto=format&fit=crop&w=800"
    )
)
