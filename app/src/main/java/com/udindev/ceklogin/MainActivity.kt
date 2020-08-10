package com.udindev.ceklogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TAG = MainActivity::class.java.simpleName
        val emailDemo = "admin@gmail.com"
        val passDemo = "admin"

        btn_login.setOnClickListener {
            val email = edt_email_login.text.toString()
            val password = edt_password_login.text.toString()

            Log.d(TAG, "onCreate: $email , $password")

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Silahkan lengkapi semua", Toast.LENGTH_SHORT).show()
            } else if (email == emailDemo && password == passDemo) {
                Toast.makeText(this, "Succes login", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SuccesActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}