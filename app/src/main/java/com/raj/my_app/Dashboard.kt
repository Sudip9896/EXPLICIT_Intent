package com.raj.my_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dashboard)
        
        val explict_button = findViewById<Button>(R.id.btn_dashboardBtn)


        explict_button.setOnClickListener {

            val ex_intent = Intent(this, Login_Activity::class.java)
            startActivity(ex_intent)
        }

    }
}