package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddHome
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NewsApp(innerPadding)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun NewsApp(innerPadding : PaddingValues) {
    //Estructura Base
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
        .background(Color.Gray)
    ) {
        //TopBar
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(50.dp)
                .border(1.dp, Color.Blue, CircleShape) // <--- Agrega esta línea
                .clip(CircleShape),
                //.background(Color.Cyan),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Icon(
                imageVector = Icons.Default.AddHome,
                contentDescription = "Search",
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            )
            Text(
                text = "Buscar",
            )
        }

        //RowTaps
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(30.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        )
        {
            Text(
                text = "Noticias",
                fontSize = 23.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
            )

            Text(
                text = "Eventos",
                fontSize = 23.sp,
                color = Color.LightGray,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Clima",
                fontSize = 23.sp,
                color = Color.LightGray,
                fontWeight = FontWeight.Bold
            )
        }

        //UltimasNoticias

        //LazyColumn

    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    NewsAppTheme {
        NewsApp(innerPadding = PaddingValues(25.dp))

    }
}