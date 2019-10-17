package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

// : = extends
class MainActivity : AppCompatActivity() {
    //onCreate [execute in one time] = main() in java
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        //activity_main --> UI
        setContentView(R.layout.activity_main)
        //TODO : Continue work here
        //val = value, var = variable
        //Java --> int x;  vs  Kotlin --> val x : int
        //findViewById = link program to UI
        //"Button" word in red color mean need import library file  (Alt + Enter)
        val buttonClickMe : Button = findViewById(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener { showMessage() }
        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener { showReset() }
    }
    //showMessage() [execute when click it]
    private fun showMessage() {
        val textViewMessenger : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.hello))
    }

    private fun showReset() {
        val textViewMessenger : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.app_name))
    }
}
