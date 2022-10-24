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
            for (i in 1..4){
                Log.d(TAG,"1111111111111111111")
            }

            for (i in 4 downTo 1 step 2) {
                Log.d(TAG,"22222222222222222222222")
            }
        }



    }
}

/**
 *
+ 1. Создать новый проект в Android Studio без поддержки Kotlin.
+ 2. Сконфигурировать Kotlin в новом проекте (лучше вручную).
+ 3. Перевести MainActivity на Kotlin.
+ 4. Добавить кнопку в разметку и повесить на неё clickListener в Activity.
5. Потренироваться в создании классов и функций, описанных в уроке, и убедиться, что всё работает. Например, создать тестовое приложение:
a. Сформировать data class с двумя свойствами и вывести их на экран приложения.
b. Создать Object. В Object вызвать copy и вывести значения скопированного класса на экран.
c. Вывести значения из разных циклов в консоль, используя примеры из методических материалов.
6. Изучить API погоды «Яндекса», посмотреть примеры и зарегистрироваться в качестве разработчика, получить свой ключ разработчика.
7. Изучить API базы данных с фильмами и зарегистрироваться в качестве разработчика, получить свой ключ разработчика.
8. Определиться с экранами и инструментарием своего будущего приложения с фильмами на основе возможностей API.
 */