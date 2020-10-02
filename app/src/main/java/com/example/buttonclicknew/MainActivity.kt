package com.example.buttonclicknew

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById<EditText>(R.id.editText)
        userInput.text.clear()
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)

        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            textView?.append(userInput.text)
            textView?.append(("\n"))
            userInput.setText("")
        }

    }

}


