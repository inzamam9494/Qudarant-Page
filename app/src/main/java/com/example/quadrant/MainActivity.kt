package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_Quadrant()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun Compose_Quadrant() {

    Column {
        Row {
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(200.dp)
                    .background(Color.Cyan)
            ) {
                Column {

                    Text(text = "",
                        modifier = Modifier
                            .weight(0.6f))

                    Text(text = "Text Composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(16.dp)
//                            .weight(0.3f)
                        )
                    Text(
                        text = "Displays   text    and   follows     the" +
                                "   recommended        Material      Design" +
                                " guidelines.",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(1f)
                    )
                }

            }
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(200.dp)
                    .background(Color.Green)
            ) {
                Column {
                    Text(text = "",
                        modifier = Modifier
                            .weight(0.6f))

                    Text(text = "Image Composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(16.dp)
//                            .weight(0.3f)
                    )
                    Text(
                        text = "Creates a composable that " +
                                "lays out and draws a given " +
                                "Painter class object.",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(1f)
                    )
                }

            }
        }

        Row(horizontalArrangement = Arrangement.Center) {
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(200.dp)
                    .background(Color.Magenta)
            ) {
                Column {
                    Text(text = "",
                        modifier = Modifier
                            .weight(0.6f))

                    Text(text = "Row Composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(16.dp)
//                            .weight(0.3f)
                    )
                    Text(
                        text = "A layout composable that places " +
                                "its children in a horizontal sequence.",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(1f)
                    )
                }

            }
            Box(
                modifier = Modifier
                    .height(400.dp)
                    .width(200.dp)
                    .background(Color.Yellow)
            )
            {
                Column {
                    Text(text = "",
                        modifier = Modifier
                            .weight(0.6f))

                    Text(text = "Column Composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(CenterHorizontally)
                            .padding(16.dp)
//                            .weight(0.3f)
                    )
                    Text(
                        text = "A layout composable that places its " +
                                "children in a vertical sequence.",
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(1f)
                    )
                }

            }
        }
    }

}