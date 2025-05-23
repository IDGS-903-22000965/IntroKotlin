package com.cortez.introkotlin903

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cortez.introkotlin903.actividades.CinepolisActivity
import com.cortez.introkotlin903.practica1.saludoActivity
import com.cortez.introkotlin903.practica2.operasActivity
import com.cortez.introkotlin903.practica3.Ejemplo3Activity
import com.cortez.introkotlin903.practica4.ArchivosMainActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSaludoPractica1 = findViewById<Button>(R.id.btn1)
        val btnCinepolisApp = findViewById<Button>(R.id.btnCinepolis)
        val btnEjemploPractica3 = findViewById<Button>(R.id.btnEjemplo3)
        val btnEjemploPractica4 = findViewById<Button>(R.id.btnEjemplo4)

        btnSaludoPractica1.setOnClickListener { navigateToSaludoActivity() }
        btnCinepolisApp.setOnClickListener { navigateToCinepolisActivity() }
        btnEjemploPractica3.setOnClickListener { navigateToEjemplo3Activity() }
        btnEjemploPractica4.setOnClickListener { navigateToEjemplo4Activity() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToSaludoActivity() {
        val intent = Intent(this, saludoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToCinepolisActivity() {
        val intent = Intent(this, CinepolisActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToEjemplo3Activity() {
        val intent = Intent(this, Ejemplo3Activity::class.java)
        startActivity(intent)
    }
    private fun navigateToEjemplo4Activity() {
        val intent = Intent(this, ArchivosMainActivity::class.java)
        startActivity(intent)
    }


}