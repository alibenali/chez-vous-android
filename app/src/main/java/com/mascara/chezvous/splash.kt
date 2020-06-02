package com.mascara.chezvous

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashLogo.alpha = 0.2f
        splashLogo.animate().apply {
            alpha(1f)
            startDelay = 1000
        }

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()


        },2000)
    }
}
