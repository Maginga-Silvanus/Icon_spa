package com.example.icon_spa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.widget.Button
import android.widget.TextView
import com.example.icon_spa.LoginActivity

class MainActivity : AppCompatActivity() {
    lateinit var tvTitle : TextView
    lateinit var tvinfo : TextView
    lateinit var BtnContinue : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTitle = findViewById(R.id.mTvTitle)
        tvinfo = findViewById(R.id.mTvInfo)
        BtnContinue = findViewById(R.id.mBtnContinue)

        BtnContinue.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}