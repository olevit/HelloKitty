package com.example.hellokitty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton.setOnClickListener {
            textView.text = "Hello Kitty!"
        }

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = "Hello Kitty!"
            } else {
                this.textView.text = "Привіт, " + editText.text + "!"
            }

        }
    }
}
