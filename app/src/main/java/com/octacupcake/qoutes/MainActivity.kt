package com.octacupcake.qoutes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.octacupcake.qoutes.ui.theme.QoutesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QoutesTheme {
                    QuotesApp()
            }
        }
    }
}
@Preview
@Composable
fun QuotesApp() {
    Quotes(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun Quotes(modifier: Modifier = Modifier){
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.width(120.dp)
            ){
                Text(text="Previous")

            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.width(120.dp)
            ) {
                Text(text="Next")

            }
        }
    }

}

