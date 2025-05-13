package com.cortez.introkotlin903.temasKotlin
fun saludo()
{
    return println("Hola mundo")
}
fun suma(x: Int, y: Int): Int{
    return x+y
}

fun suma2(x: Int, y: Int) = x + y

fun main(){
    saludo()
    println("_______________________________________________________________________________________")
    println(suma(5,7))
    println(suma2(2, 3))
}

