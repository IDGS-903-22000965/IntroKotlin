package com.cortez.introkotlin903.temasKotlin

/*
 practica3 Imprimir una piramide de * segun el numero dado por el usuario cuando se capture un 0 terminar el programa,
 utilizando puro do-while
 */
fun main() {
    var numero: Int

    do {
        println("Ingresa un número entero (0 para salir):")
        numero = readLine()?.toIntOrNull() ?: 0
        if (numero > 0) {
            var i = 1
            do {
                var j = 1
                do {
                    print(" ")
                    j++
                } while (j <= numero - i)

                var k = 1
                do {
                    print("*")
                    k++
                } while (k <= 2 * i - 1)


                println()
                i++
            } while (i <= numero)
        } else if (numero < 0) {
            println("Ingresa un número positivo.")
        }

    } while (numero != 0)

    println("Cerrando programa")
}