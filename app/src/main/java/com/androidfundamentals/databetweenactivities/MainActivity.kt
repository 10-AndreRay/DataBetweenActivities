package com.androidfundamentals.databetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnApply).setOnClickListener {
            val name: String = findViewById<EditText>(R.id.etName).text.toString()
            val age: Int = findViewById<EditText>(R.id.etAge).text.toString().toInt()
            val country: String = findViewById<EditText>(R.id.etCountry).text.toString()

            val person = Person(name, age, country)

            Intent(this, SecondActivity::class.java).also{
                /*
                it.putExtra("EXTRA_NAME", name)
                it.putExtra("EXTRA_AGE", age)
                it.putExtra("EXTRA_COUNTRY", country)
                 */
                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
        }
    }
}