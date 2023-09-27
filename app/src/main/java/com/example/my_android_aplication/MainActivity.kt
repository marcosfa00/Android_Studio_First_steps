package com.example.my_android_aplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_android_aplication.ui.theme.My_android_aplicationTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp


import kotlin.math.log




class MainActivity : ComponentActivity() {

    val TAG = "Estado"
    var name:String= "Android"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_android_aplicationTheme {
                // A surface container with a sky blue background color
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Yellow // Cambiar el color a SkyBlue
                ) {
                    Greeting(name)
                }
            }
        }

        Log.d(TAG, "Estoy programando en android")
    }

    override fun onStart() {
            super.onStart()
            Log.d(TAG,"Esto se ejecuta en el start del telefono")
        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG,"pausa")
        }

        override fun onStop() {
            super.onStop()
            Log.d(TAG,"Stop")
        }

        override fun onRestart() {
            super.onRestart()
            Log.d(TAG,"Restart")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG,"Destroy")
        }

    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Mi nombre es  $name!",
            modifier = modifier,
            fontSize = 40.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    My_android_aplicationTheme {
        Greeting("Máximo Décimo Meridio, comandante de los ejércitos del Norte, general de las legiones medias, fiel servidor del verdadero emperador, Marco Aurelio, padre de un hijo asesinado, marido de una mujer asesinada y alcanzaré mi venganza, en esta vida o en la próxima")
    }
}
