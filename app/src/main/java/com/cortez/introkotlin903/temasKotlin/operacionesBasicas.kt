package com.cortez.introkotlin903.temasKotlin

fun main() {
    var opcion: Int
    do {
        println("Calculadora:")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")
        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull() ?: -1

        when (opcion) {
            1 -> {
                val num1 = pedirNumero("primer")
                val num2 = pedirNumero("segundo")
                println("Resultado: ${num1 + num2}")
            }
            2 -> {
                val num1 = pedirNumero("primer")
                val num2 = pedirNumero("segundo")
                println("Resultado: ${num1 - num2}")
            }
            3 -> {
                val num1 = pedirNumero("primer")
                val num2 = pedirNumero("segundo")
                println("Resultado: ${num1 * num2}")
            }
            4 -> {
                val num1 = pedirNumero("dividendo")
                val num2 = pedirNumero("divisor")
                if (num2 != 0.0) {
                    println("Resultado: ${num1 / num2}")
                } else {
                    println("Error: No se puede dividir")
                }
            }
            5 -> println("Saliendo")
            else -> println("Opción inválida")
        }
    } while (opcion != 5)
}

fun pedirNumero(orden: String): Double {
    print("Ingresa el $orden número: ")
    return readLine()?.toDoubleOrNull() ?: 0.0
}