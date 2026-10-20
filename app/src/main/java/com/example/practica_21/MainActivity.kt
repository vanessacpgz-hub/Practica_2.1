package com.example.practica_21

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica_21.ui.theme.Practica_21Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica_21Theme() {
                BirthdayGreetingWithImage(
                    message = getString(R.string.mensaje),
                    from = getString(R.string.from),
                    image = R.drawable.images
                )
            }
        }

    }
}

@Composable
fun BirthdayGreetingWithText (message: String, from: String){
    Surface(color = Color.Magenta) {
        Column {
            Text(text = message,
                fontSize = 24.sp,
                color = Color.Blue,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(10.dp)
            )
            Text(text = from,
                fontSize = 24.sp,
                color = Color.Blue,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .padding(10.dp)
            )
        }
    }

}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, image: Int){
    val image = painterResource(id = image)
    BirthdayGreetingWithText(message, from)

    Box{
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentScale = ContentScale.FillWidth
        )
    }
}