package com.cortez.introkotlin903.practica2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cortez.introkotlin903.R
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class operasActivity : AppCompatActivity() {
    private lateinit var edt1: EditText
    private lateinit var edt2: EditText
    private lateinit var rgOperaciones: RadioGroup
    private lateinit var rbSuma: RadioButton
    private lateinit var rbResta: RadioButton
    private lateinit var rbMultiplicacion: RadioButton
    private lateinit var rbDivision: RadioButton
    private lateinit var btnCalcular: Button
    private lateinit var tv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        rgOperaciones = findViewById(R.id.grupo1)
        rbSuma = findViewById(R.id.r1)
        rbResta = findViewById(R.id.r2)
        rbMultiplicacion = findViewById(R.id.r3)
        rbDivision = findViewById(R.id.r4)
        btnCalcular = findViewById(R.id.btn1)
        tv1 = findViewById(R.id.tv1)

        rbSuma.isChecked = true

        btnCalcular.setOnClickListener {
            calcular()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun calcular() {
        val num1Str = edt1.text.toString()
        val num2Str = edt2.text.toString()

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            tv1.text = "Por favor, ingrese ambos números."
            return
        }

        val num1 = num1Str.toDouble()
        val num2 = num2Str.toDouble()
        var resultado = 0.0
        var operacion = ""

        when (rgOperaciones.checkedRadioButtonId) {
            R.id.r1 -> {
                resultado = num1 + num2
                operacion = "Suma"
            }
            R.id.r2 -> {
                resultado = num1 - num2
                operacion = "Resta"
            }
            R.id.r3 -> {
                resultado = num1 * num2
                operacion = "Multiplicacion"
            }
            R.id.r4 -> {
                if (num2 != 0.0) {
                    resultado = num1 / num2
                    operacion = "Division"
                } else {
                    tv1.text = "Error: No se puede dividir por cero"
                    return
                }
            }
        }
        tv1.text = "Resultado $operacion: $resultado"
    }
}