package com.andrdoid.movies

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        val data = SimpleDataClass("Топ", 100)
        txt.text = data.title + " " + data.number

        val movie = Movie("Мстители")
        movie.copy()


        button.setOnClickListener {
            Log.d(TAG, "Click")
            for (i in 1..4) {
                Log.d(TAG, "1111111111111111111")
            }

            for (i in 4 downTo 1 step 2) {
                Log.d(TAG, "22222222222222222222222")
            }
        }


    }
}
