package com.damabrasileira.ai

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this).apply {
            text = "DamaBrasileiraAI (12x12)"
            textSize = 22f
        }
        setContentView(tv)
    }
}
