package com.raj.my_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)


        val Explict_Button= findViewById<Button>(R.id.btnlogin)

        Explict_Button.setOnClickListener {

            val ex_intent = Intent(this,Dashboard::class.java)
            startActivity(ex_intent)

        }

    }
}