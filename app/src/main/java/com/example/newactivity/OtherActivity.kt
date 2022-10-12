package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnToMainActivity.setOnClickListener {
//            MainActivity로 돌아가는 코드

//            val returnIntent = Intent(this, MainActivity::class.java)
//            startActivity(returnIntent)

            finish()
        }
    }
}