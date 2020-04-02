package com.example.lektion01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText : EditText

    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.inputText)

        Log.d(TAG, "Hej")


        val button = findViewById<Button>(R.id.button)

        button.text = "Tryck Här!"

        button.setOnClickListener { v ->
            val message = editText.text.toString()
            Log.d(TAG, message)
        }

    }
/*
    fun buttonPressed(view: View) {
        val input = editText.text.toString()
        Log.d(TAG, input)


    }

 */
}
