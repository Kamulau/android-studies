package com.example.myfirstapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
const val CHANNEL_ID = "com.example.myfirstapp"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendDefault1(view: View) {
        val textView = findViewById<TextView>(R.id.textView2)
        val message = textView.text.toString()
        sendMessage(message)
    }

    fun sendDefault2(view: View) {
        val textView = findViewById<TextView>(R.id.textView3)
        val message = textView.text.toString()
        sendMessage(message)
    }

    /**
     * Called when the user taps the Send button
     */
    fun sendTypedMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        sendMessage(message)
    }

    fun sendMessage(message: String) {
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}