package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button2).setOnClickListener{

            addNickName(it )
        }
    }

   private  fun addNickName(view : View){
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknamTextView = findViewById<TextView>(R.id.nickname_text)
        nicknamTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.VISIBLE

    }
}
