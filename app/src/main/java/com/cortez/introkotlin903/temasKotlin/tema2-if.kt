package com.cortez.introkotlin903.temasKotlin

fun main(){
    println("Ingresa el sueldo del empleado")
    val sueldo= readln().toDouble()
    if (sueldo>=3000){
        println("Debe de pagar impuestos")
    }else{
        println("No debe de pagar impuestos")
    }
}



