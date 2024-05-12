package com.example.taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ScreenTwo : AppCompatActivity() {
    private lateinit var logoLoadTwo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_two)
        // Initialize medlogoLoad
        logoLoadTwo = findViewById(R.id.logoLod)

        logoLoadTwo.alpha = 0f
        logoLoadTwo.animate().setDuration(5000).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java) // Replace NextActivity with the actual name of your next activity
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}