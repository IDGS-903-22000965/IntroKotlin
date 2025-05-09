package com.cortez.introkotlin903.temasKotlin
/*
practica: formula general basica con input simple
 */
import kotlin.math.*

fun main() {
    var continuar = true

    while (continuar) {
        println("\nEcuación cuadrática (ax² + bx + c = 0)")

        try {
            print("a: ")
            val a = readLine()!!.toDouble()
            if (a == 0.0) {
                println("Error: 'a' debe ser distinto de cero")
                continue
            }

            print("b: ")
            val b = readLine()!!.toDouble()

            print("c: ")
            val c = readLine()!!.toDouble()

            val d = b * b - 4 * a * c

            if (d > 0) {
                println("x1 = ${(-b + sqrt(d)) / (2 * a)}")
                println("x2 = ${(-b - sqrt(d)) / (2 * a)}")
            } else if (d == 0.0) {
                println("x = ${-b / (2 * a)}")
            } else {
                val r = -b / (2 * a)
                val i = sqrt(-d) / (2 * a)
                println("x1 = $r + ${i}i")
                println("x2 = $r - ${i}i")
            }
        } catch (e: Exception) {
            println("Error: Verifica los datos")
        }

        print("¿Continuar? (s/n): ")
        continuar = readLine()?.lowercase() == "s"
    }
}