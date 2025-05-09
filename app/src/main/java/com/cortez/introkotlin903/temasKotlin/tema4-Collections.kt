package com.cortez.introkotlin903.temasKotlin

fun main() {
    /*
    List: Lista simple parecida a los arreglos, es lista ordenada permite elementos dupplicados. variables val
    MutableList  -- variables var
    Set-- admite valores unicos
    MuatbleSet-- variables var, tambien admite valores unicos
    Map -- son como los diccionarios en python, no mutable
    MutableMap    -- tambien son como los diccionarios en python, mutable
     */

    var lista = listOf<String>("Lunes", "Martes", "Miercoles")
    println(lista)
    println(lista.count())
    println(lista.size)
    println(lista.get(0))
    println(lista.indexOf("Miercoles"))
    println(lista[1])
    println(lista.first())
    println(lista.last())

    var listaMutable = mutableListOf<String>("Lunes", "Martes", "Miercoles")
    println(listaMutable)
    listaMutable.add("Jueves")
    listaMutable.removeAt(0)
    println(listaMutable)
    listaMutable.add(0, "Domingo")
    println(listaMutable)
    listaMutable.remove("Miercoles")



}