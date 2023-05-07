package com.example.composearticle

import android.graphics.Color.green
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.composearticle.R.drawable
import androidx.compose.foundation.Image

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticleText("Jetpack Compose tutorial", anotherName = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs." , lastWord = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
                }
            }
        }
    }
}
@Composable
fun ComposeArticleImage(name: String, anotherName: String, lastWord: String) {
    Box{
    Image(painterResource(id = R.drawable.bg_compose_background),
    contentDescription = "Image")

        ComposeArticleText(name = name, anotherName = anotherName, lastWord = lastWord)
    }
}

@Composable
fun ComposeArticleText(name: String, anotherName: String, lastWord: String) {
    Column {
        Text(
            text = name,
            fontSize = 24.sp,
            modifier = Modifier.fillMaxWidth()
                .wrapContentWidth(
                    Alignment.CenterHorizontally).
            padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 125.dp)
        )
        Text(
            text = anotherName, modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(
                    Alignment.CenterHorizontally
                )
                .padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
        )
        Text(text = lastWord, modifier = Modifier.fillMaxWidth()
            .wrapContentWidth(
                Alignment.CenterHorizontally)
            .padding(all = 16.dp), textAlign = TextAlign.Justify)
    }
}
@Preview(showBackground = true)
@Composable
fun ComposeArticleImagePreview() {
    ComposeArticleTheme {
        ComposeArticleImage("Jetpack Compose tutorial", anotherName = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs." , lastWord = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}