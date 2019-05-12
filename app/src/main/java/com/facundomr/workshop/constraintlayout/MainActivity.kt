package com.facundomr.workshop.constraintlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goneMargins.setOnClickListener {
            goToSection(GoneMarginsActivity::class.java)
        }
    }

    private fun goToSection(classActivity: Class<GoneMarginsActivity>) {
        startActivity(Intent(this, classActivity))
    }

}