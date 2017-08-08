package com.rajeshdalsaniya.edittextdemo


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

/**
 * Created by rajeshdalsaniya on 08/08/17.
 */


class DisplayMessageActivity : AppCompatActivity() {
    private val INTENT_USER_MESSAGE = "user_message"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)


        // Get TextView
        val textView = findViewById<View>(R.id.textView) as TextView
        // Get message value from Intent
        val message = intent.getStringExtra(INTENT_USER_MESSAGE)
        // Message will display on null value
        requireNotNull(message) { "user_message provided in Intent extras" }
        // Set textView text
        textView.text = message


    }


}

