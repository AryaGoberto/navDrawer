package com.example.navigationdrawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.navigationdrawer.ui.theme.NavigationDrawerTheme
import com.example.navigationdrawer.ui.theme.greenJC

@Composable
fun Profile() {
    Box(modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier
            .fillMaxSize()
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Profile", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = greenJC)
        }
    }
}
@Preview
@Composable
fun ProfilePreview(){
    NavigationDrawerTheme{
        Profile()

    }
}