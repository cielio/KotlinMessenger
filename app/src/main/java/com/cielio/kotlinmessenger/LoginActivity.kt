package com.cielio.kotlinmessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cielio.kotlinmessenger.databinding.ActivityLoginBinding
import com.cielio.kotlinmessenger.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}