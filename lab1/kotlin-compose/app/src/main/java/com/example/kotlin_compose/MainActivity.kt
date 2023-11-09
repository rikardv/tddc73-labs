package com.example.kotlin_compose

import android.database.Cursor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.kotlin_compose.ui.theme.KotlincomposeTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlincomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  MyContent()
                }
            }
        }
    }
}

@Composable
fun MyContent(){
    Column() {
        header(textValue = "Example 1")
        Column(
            Modifier
                .fillMaxWidth()
                .absolutePadding(10.dp, 5.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {

            Image(painter = painterResource(id = R.drawable.matcirkel), contentDescription = "")
            Spacer(modifier = Modifier.height(20.dp))
            FilledButtonRow {}
            Spacer(modifier = Modifier.height(20.dp))
            FilledButtonRow {}
            Spacer(modifier = Modifier.height(20.dp))
            LabelAndPlaceHolder()
        }
    }

}

@Composable
fun FilledButtonRow(onClick: () -> Unit) {
   Row() {
       FilledButton {}
       Spacer(modifier = Modifier.width(80.dp))
       FilledButton {}
   }
}


@Composable
fun FilledButton(onClick: () -> Unit) {
    Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(backgroundColor =Color.LightGray),
    ) {
        Text("BUTTON", color = Color.Black, fontWeight = FontWeight.Bold)
    }
}

// TODO
@Composable
fun LabelAndPlaceHolder() {
    Row(){
    Text(text = "Email", textAlign = TextAlign.Left, modifier = Modifier.padding(20.dp))
        Spacer(modifier = Modifier.weight(1f))
    TextField(value = "", onValueChange = {}, singleLine = true,colors = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.White,

        focusedIndicatorColor = Color.Red,
        unfocusedIndicatorColor = Color.Gray
    ),modifier = Modifier
        .width(280.dp)
        .padding(end = 90.dp),

    )
    }
}

@Composable
fun header(textValue: String){
    Box(
        Modifier
            .height(60.dp)
            .fillMaxWidth()
            .background(Color(0xFF2E8B57))
    ){
        Text( text = textValue,Modifier.align(Alignment.CenterStart).padding(start = 20.dp), fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
    }
}





