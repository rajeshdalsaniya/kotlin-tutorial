package com.rajeshdalsaniya.edittextdemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by rajeshdalsaniya on 08/08/17.
 */



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set onClick listener for button
        button.setOnClickListener { sendMessage() }

    }

    // Function (Method) Called when user taps the Send button
    fun sendMessage() {

        val editText = findViewById<View>(R.id.editText) as EditText
        val message = editText.text.toString()
        val intent = MainActivity.newIntent(this, message)
        startActivity(intent)

    }

    // Because kotlin has no static fields a companion object is used, a single shared object
    // between all instances of the hosting class.
    companion object {

        private val INTENT_USER_MESSAGE = "user_message"
        // Intent Method
        fun newIntent(context: Context, message: String): Intent {
            val intent = Intent(context, DisplayMessageActivity::class.java)
            intent.putExtra(INTENT_USER_MESSAGE, message)
            return intent
        }
    }


}
