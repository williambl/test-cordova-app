package com.williambl.testapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import android.content.Intent
import android.widget.EditText

class Main : AppCompatActivity() {

    companion object {
        const val extraMessage = "com.williambl.testapplication.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendToast(view: View) {
        val context = applicationContext
        val editText = findViewById<View>(R.id.editText) as EditText
        val text = editText.text.toString()
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(context, text, duration)
        toast.show();
    }

    fun sendMessage(view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById<View>(R.id.editText) as EditText
        val message = editText.text.toString()
        intent.putExtra(extraMessage, message)
        startActivity(intent)
    }

}
