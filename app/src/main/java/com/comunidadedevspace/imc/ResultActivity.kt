package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvCategory = findViewById<TextView>(R.id.tv_category)
        val result: Float = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        tvResult.text = result.toString()

        tvCategory.text = when{
            result < 18.5f -> "MAGREZA"
            result in 18.5f..24.9f -> "NORMAL"
            result in 25f..29.9f -> "SOBREPESO"
            result in 30f..39.9f -> "OBESIDADE"
            else -> "OBESIDADE GRAVE"
        }

    }
}