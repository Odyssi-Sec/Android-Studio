package com.VarsityCollege.Aves

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class timer_history : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timer_history_page)

        supportActionBar?.hide()


        val rtButton = findViewById<ImageButton>(R.id.returnbtn)
        rtButton.setOnClickListener()
        {
            val intent = Intent(this, BirdTiming::class.java)

            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }
    }
}