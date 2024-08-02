package com.raj.my_app.EXPLICIT_Intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.raj.my_app.R

class Login_Activity : AppCompatActivity() {

     lateinit var google_btn :Button
      lateinit var  url : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        google_btn = findViewById(R.id.btnGoogle_btn)


        val Explict_Button= findViewById<Button>(R.id.btnlogin)

        Explict_Button.setOnClickListener {

            val ex_intent = Intent(this, Dashboard::class.java)
            startActivity(ex_intent)

        }
         url = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=AdF4I779sT_bi3TGBkkfcS77w0fiwsK56OihomMOCjdGJgrGkmY19I1VMOpYdWnSHUb09vewwb_54w&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-216934646%3A1722594516326299&ddm=0"
         google_btn.setOnClickListener {
            val intent  = Intent(Intent.ACTION_VIEW,Uri.parse(url))
             startActivity(intent)
         }

    }
}