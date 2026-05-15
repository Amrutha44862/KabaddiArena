package com.example.kabaddiarena

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kabaddiarena.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("KabaddiArenaPrefs", MODE_PRIVATE)

        val email = sharedPreferences.getString("email", "Player")
        binding.tvWelcome.text = "Welcome, ${email?.substringBefore("@")}!"

        binding.btnStartMatch.setOnClickListener {
            startActivity(Intent(this, MatchScoreActivity::class.java))
        }

        binding.btnLogout.setOnClickListener {
            sharedPreferences.edit().putBoolean("isLoggedIn", false).apply()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}
