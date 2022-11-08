/*
* Reto #8
* DECIMAL A BINARIO
* Fecha publicación enunciado: 18/02/22
* Fecha publicación resolución: 02/03/22
* Dificultad: FÁCIL
*
* Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
*/

fun main (){
    decimal2binary(0)
}

private fun decimal2binary(n: Int){
    var num = n
    var bin : MutableList<Int> = mutableListOf()

    while(num != 0){
        bin.add(num % 2)
        num /= 2
    }
    if(n == 0) bin.add(0)
    println(bin.reversed())
}