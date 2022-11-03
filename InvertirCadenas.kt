/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

fun main (){
    var str = "Hello world"
    println(str)
    println(str.reversed())
    println(reversedOrder(str))
}

fun reversedOrder(str : String) : String {
    var res = ""
    for(i in str.length-1 downTo 0) res += str[i]
    return res
}

