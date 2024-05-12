package com.example.msib

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.msib.ui.theme.Pink400

@Composable
fun Data1(
    modifier: Modifier = Modifier,
    photos: Array<Int>,
    names: Array<String>,
    ingredients: Array<String>,
    detail: Array<String>,
    itemIndex: Int?
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = photos[itemIndex!!]),
                contentDescription = names[itemIndex],
                modifier = Modifier.size(200.dp)
            )
        }
        Text(
            text = names[itemIndex!!],
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = detail[itemIndex!!],
            fontSize = 18.sp,
            color = Color.Black
        )
    }
}
