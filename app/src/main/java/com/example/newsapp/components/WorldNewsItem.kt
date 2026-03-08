package com.example.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.models.WorldNew
import com.example.newsapp.models.worldNewsList
import com.example.newsapp.ui.theme.NewsAppTheme
import coil3.compose.AsyncImage


@Composable
fun WorldNewsItem(worldNew: WorldNew){
    Box(
        modifier = Modifier
            .height(175.dp)
            .width(150.dp)
            .clip(RoundedCornerShape(20.dp))
    )
    {
        AsyncImage(
            model = worldNew.image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(
                    color = Color.LightGray,
                    shape = RoundedCornerShape(1.dp)
                )
        ) {
            Text(
                text = worldNew.title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 15.sp,
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp)
            )
        }
    }
}

@Preview()
@Composable
fun WorldNewsItemPreview() {
    NewsAppTheme() {
        WorldNewsItem(
            worldNewsList[0]
        )
    }
}
