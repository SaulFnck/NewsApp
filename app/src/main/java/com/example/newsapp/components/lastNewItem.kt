package com.example.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.models.lastNew
import com.example.newsapp.models.lastNewsList
import com.example.newsapp.ui.theme.NewsAppTheme

@Composable
fun lastNewItem(lastNew: lastNew){
    Column(
        modifier = Modifier
            .padding(5.dp)
            .width(300.dp)
            .height(200.dp)
            .background(Color.Blue, shape = RoundedCornerShape(20.dp)),
        verticalArrangement = Arrangement.Bottom

    ) {
        Text(
            text = lastNew.title,
            color = Color.White,
            lineHeight = 30.sp,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = lastNew.date,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(10.dp)

        )
    }
}

@Preview()
@Composable
fun GreetingPreview() {
    NewsAppTheme() {
        lastNewItem(
            lastNewsList[0]
        )
    }
}