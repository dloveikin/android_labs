package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val zeroButton: Button = findViewById(R.id.zero_button)
        rollButton.setOnClickListener { rollDice() }
        zeroButton.setOnClickListener { Zero() }
    }
    private fun rollDice() {
        Toast.makeText(this, "button clicked",
                Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

    }
    private fun Zero(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}
