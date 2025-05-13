package com.cortez.introkotlin903.temasKotlin

class Usuarios() {
    var materia:String=""
}

class Usuarios2(val id:Int, val nombre:String){
    var materia:String=""
    fun hola(){
        println("Hola {nombre} ")
    }
}

fun main(){
    val alumno1 = Usuarios()
    val alumno2 = Usuarios2(id=1, nombre="Diego")

    println(alumno2.id)
    println(alumno2.nombre)
    alumno2.hola()
}
