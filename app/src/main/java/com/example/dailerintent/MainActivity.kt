package com.example.dailerintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    internal var number:String?=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dialBtn = findViewById<Button>(R.id.dialBtn)
        var numberEt = findViewById<EditText>(R.id.numberEt)

        dialBtn.setOnClickListener {
            //get input from editText
            number = numberEt.text.toString().trim()

            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode(number)))
            startActivity(intent)
        }
    }
}