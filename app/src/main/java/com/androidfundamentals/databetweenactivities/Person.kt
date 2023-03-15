package com.androidfundamentals.databetweenactivities

import java.io.Serializable

data class Person(
    val name: String = "",
    val age: Int = 0,
    val country: String = ""
) : Serializable
