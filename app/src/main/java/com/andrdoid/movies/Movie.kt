package com.andrdoid.movies

class Movie(
    val name: String = "Фильм",
    val description: String = "Какой-то фильм"
){
    fun copy(): Any {
        return println(name + " " + description)
    }
}