package com.firstpenguin.kotlinbasic_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    clickBtn.setOnClickListener {
    Log.d("메인화면로그", "클릭용 버튼 눌림")
        Log.e("메인화면로그","에러 관련 로그")

    }
    }
    }