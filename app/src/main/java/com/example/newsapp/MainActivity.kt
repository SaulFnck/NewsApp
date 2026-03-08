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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddHome
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.components.lastNewItem
import com.example.newsapp.components.WorldNewsItem
import com.example.newsapp.models.lastNewsList
import com.example.newsapp.models.worldNewsList
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
fun NewsApp(innerPadding : PaddingValues) {
    //Estructura Base
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
        //.background(Color.Gray)
    ) {
        //TopBar
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(50.dp)
                .border(1.dp, Color.Blue, CircleShape)
                .clip(CircleShape),
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
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(275.dp)
        )
        {
            Text(
                text = "Ultimas noticias",
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp)
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                items(lastNewsList){
                    lastNew -> lastNewItem(lastNew)
                }
            }

        }

        //LazyVerticalGrid
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
                .background(Color.White)
        ) {
            Text(
                text = "Alrededor del mundo",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(5.dp)
            )

            //lazy grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(worldNewsList){
                    worldNew -> WorldNewsItem(worldNew)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    NewsAppTheme {
        NewsApp(innerPadding = PaddingValues(25.dp))
    }
}
