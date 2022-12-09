package com.example.myapplication

class Animal(
    val name: String,
    var size: String,
    var counLap: Int,
    var hishnik: String,
    var live: LiveAnimal,
    var eat: EatAnimal
){
    override fun toString(): String {
        return "$name, $size, $counLap, $hishnik, $live, $eat"
    }
}