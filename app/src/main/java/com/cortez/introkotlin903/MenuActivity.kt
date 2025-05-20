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

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnSaludo = findViewById<Button>(R.id.btn1)

        btnSaludo.setOnClickListener{navegateToSaludo()}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    private fun navegateToSaludo(){
        val intent = Intent(this, CinepolisActivity::class.java)
        startActivity(intent)
    }
}