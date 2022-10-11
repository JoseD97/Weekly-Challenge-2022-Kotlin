/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

// Sieve of Eratosthenes
fun main(){
    var array = IntArray(99) { it + 2 } // Starts in 2 because 0 and 1 are not prime number

    for((pos,value) in array.withIndex()){
        if(value != 0){
            for(i in pos until array.size){
                if(array[i] != value && array[i] % value == 0) array[i] = 0  // Checks if the following numbers are multiples of "value", and if it is, it will be marked with a zero (no prime number)
            }
        }
        if(value != 0) println(value)
    }
}