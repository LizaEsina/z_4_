package com.example.z_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityMainBinding.inflate(layoutInflater).also {setContentView(it.root)}
                binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
                        if (checkedId == binding.radioButton.id) {
                                binding.editTextNumberDecimal1.visibility = View.VISIBLE
                        } else {
                                binding.editTextNumberDecimal1.visibility = View.GONE
                        }
                }
        }
}