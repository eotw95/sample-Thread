package com.example.samplethread

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplethread.ui.theme.SampleThreadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main()
        setContent {
            SampleThreadTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }

    private fun main() {
        // Thread.sleep()の動きを確認
        printLoop()
        Util().printLoopUtil()
        println("Thread.sleep start")
        Thread.sleep(20000)
        println("Thread.sleep finish")
    }
    private fun printLoop() {
        repeat(100) {
            println("print=$it")
        }
    }
}