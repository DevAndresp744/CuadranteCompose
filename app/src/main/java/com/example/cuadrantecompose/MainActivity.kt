package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposableContent()
                }
            }
        }
    }
}

@Composable
fun ComposableContent()
{
    Column(Modifier.fillMaxSize()) {
        //Row 1
        Row (Modifier.weight(1f)){
            //columna 1
            ComposableText(
                title = stringResource(id = R.string.textComposable),
                description = stringResource(id = R.string.descriptionTextComposable),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            //columna2
            ComposableText(
                title = stringResource(id = R.string.ImageComposable),
                description = stringResource(id = R.string.DescriptionImageCoposable),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        //Row2
        Row (Modifier.weight(1f)){
            //columna3
            ComposableText(
                title = stringResource(id = R.string.RowCoposable),
                description = stringResource(id = R.string.DescriptionRowComposable),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            //columna4
            ComposableText(
                title = stringResource(id = R.string.ColumnComposable),
                description = stringResource(id = R.string.DescriptionColumnComposable),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)

            )
        }

    }

}

@Composable
fun ComposableText(title: String, description: String, backgroundColor: Color, modifier: Modifier = Modifier)
{


    Column (modifier = modifier
        .fillMaxSize()
        .background(backgroundColor)
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = title,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify)
    }

}
@Preview(showBackground = true)
@Composable
fun ComposableContentPreview() {
    CuadranteComposeTheme {

        ComposableContent()
    }
}