package com.rajeshdalsaniya.helloworld

/**
 * Created by rajeshdalsaniya on 08/08/17.
 */


import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find textView
        var textView = findViewById<TextView>(R.id.textView)
        // You can also find textview as general view and cast as textView
        // var textView = findViewById<View>(R.id.textView) as TextView

        // Set textView text
        textView.text = "HELLO WORLD!"
        // Set textView font size
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
        // Set textView font color
        textView.setTextColor(Color.BLUE)
    }
}
