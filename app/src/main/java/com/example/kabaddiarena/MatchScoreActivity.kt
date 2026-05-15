package com.example.kabaddiarena

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kabaddiarena.databinding.ActivityMatchScoreBinding

class MatchScoreActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMatchScoreBinding
    private var team1Score = 0
    private var team2Score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMatchScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateScores()

        binding.btnTeam1Plus.setOnClickListener {
            team1Score++
            updateScores()
        }

        binding.btnTeam1Minus.setOnClickListener {
            if (team1Score > 0) { team1Score--; updateScores() }
        }

        binding.btnTeam2Plus.setOnClickListener {
            team2Score++
            updateScores()
        }

        binding.btnTeam2Minus.setOnClickListener {
            if (team2Score > 0) { team2Score--; updateScores() }
        }

        binding.btnReset.setOnClickListener {
            team1Score = 0
            team2Score = 0
            updateScores()
            Toast.makeText(this, "Match Reset!", Toast.LENGTH_SHORT).show()
        }

        binding.btnEndMatch.setOnClickListener {
            val team1Name = binding.etTeam1Name.text.toString().ifEmpty { "Team 1" }
            val team2Name = binding.etTeam2Name.text.toString().ifEmpty { "Team 2" }
            val result = when {
                team1Score > team2Score -> "$team1Name Wins! 🏆"
                team2Score > team1Score -> "$team2Name Wins! 🏆"
                else -> "It's a Draw! 🤝"
            }
            binding.tvResult.text = result
            Toast.makeText(this, result, Toast.LENGTH_LONG).show()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun updateScores() {
        binding.tvTeam1Score.text = team1Score.toString()
        binding.tvTeam2Score.text = team2Score.toString()
        binding.tvResult.text = ""
    }
}
