package com.cortez.introkotlin903.actividades

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cortez.introkotlin903.R

class CinepolisActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etCantidadCompradores: EditText
    private lateinit var etCantidadBoletos: EditText
    private lateinit var rbSi: RadioButton
    private lateinit var rbNo: RadioButton
    private lateinit var btnCalcular: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)

        etNombre = findViewById(R.id.etNombre)
        etCantidadCompradores = findViewById(R.id.etCantidadCompradores)
        etCantidadBoletos = findViewById(R.id.etCantidadBoletos)
        rbSi = findViewById(R.id.rbSi)
        rbNo = findViewById(R.id.rbNo)
        btnCalcular = findViewById(R.id.btnCalcular)
        tvResultado = findViewById(R.id.tvResultado)

        btnCalcular.setOnClickListener {
            calcularPago()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun calcularPago() {
        val nombre = etNombre.text.toString()

        if (nombre.isEmpty() || etCantidadCompradores.text.toString().isEmpty()
            || etCantidadBoletos.text.toString().isEmpty()) {
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
            return
        }

        val cantidadCompradores = etCantidadCompradores.text.toString().toInt()
        val cantidadBoletos = etCantidadBoletos.text.toString().toInt()
        val tieneTarjetaCineco = rbSi.isChecked

        val precioBoleto = 12.000

        val maxBoletosPorPersona = 7
        val totalBoletosPermitidos = cantidadCompradores * maxBoletosPorPersona

        if (cantidadBoletos > totalBoletosPermitidos) {
            Toast.makeText(this,
                "Error: No se pueden comprar más de $maxBoletosPorPersona boletos por persona",
                Toast.LENGTH_LONG).show()
            return
        }

        var porcentajeDescuento = when {
            cantidadBoletos > 5 -> 0.15
            cantidadBoletos in 3..5 -> 0.10
            else -> 0.0
        }

        if (tieneTarjetaCineco) {
            porcentajeDescuento += 0.10
        }

        val subtotal = cantidadBoletos * precioBoleto
        val descuento = subtotal * porcentajeDescuento
        val totalPagar = subtotal - descuento

        tvResultado.text = "$ ${String.format("%.2f", totalPagar)}"
    }
}