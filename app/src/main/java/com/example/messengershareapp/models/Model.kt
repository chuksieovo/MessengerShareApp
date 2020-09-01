package com.example.messengershareapp.models

data class Hobby (var title :String)

object Supplier {
    val hobbies = listOf(
        Hobby("Swimming"),
        Hobby("Dancing"),
        Hobby("Jogging"),
        Hobby("Reading"),
        Hobby("Coding"),
        Hobby("Cooking")
    )
}