package com.facundomr.workshop.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_gone_margins.*

class GoneMarginsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gone_margins)

        toggleButton.setOnClickListener {
            val newVisibility = if (textView1.visibility == View.VISIBLE) View.GONE else View.VISIBLE
            textView1.visibility = newVisibility
        }
    }

}