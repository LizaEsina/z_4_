package com.example.z_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            radioButton.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    TextInputLayout.visibility = View.VISIBLE
                } else {
                    TextInputLayout.visibility = View.GONE
                }
            }

        }
    }
}

