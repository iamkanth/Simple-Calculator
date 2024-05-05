package com.example.simpleCalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val eInput1 = findViewById<EditText>(R.id.eInput1)
        val eInput2 = findViewById<EditText>(R.id.eInput2)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnDi = findViewById<Button>(R.id.btnDi)
        val btnMul = findViewById<Button>(R.id.btnMul)

        btnPlus.setOnClickListener {
            val input1 = eInput1.text.toString().toInt()
            val input2 = eInput2.text.toString().toInt()
            tvResult.text = (input1 + input2).toString()
        }

        btnMinus.setOnClickListener {
            val input1 = eInput1.text.toString().toInt()
            val input2 = eInput2.text.toString().toInt()
            tvResult.text = (input1 - input2).toString()
        }

        btnDi.setOnClickListener {
            val input1 = eInput1.text.toString().toInt()
            val input2 = eInput2.text.toString().toInt()
            tvResult.text = (input1 / input2).toString()
        }

        btnMul.setOnClickListener {
            val input1 = eInput1.text.toString().toInt()
            val input2 = eInput2.text.toString().toInt()
            tvResult.text = (input1 * input2).toString()
        }

        btnDi.setOnClickListener {
            val input1 = eInput1.text.toString().toInt()
            val input2 = eInput2.text.toString().toInt()
            tvResult.text = (input1 / input2).toString()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}