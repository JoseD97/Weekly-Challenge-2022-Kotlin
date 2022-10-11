/*
 Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según
 sean o no anagramas.
 Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 NO hace falta comprobar que ambas palabras existan.
 Dos palabras exactamente iguales no son anagrama.
 */

fun main (){
    if(isAnagram("amor", "mora")) println("Son anagrama")
    else println("No son anagrama")
}

fun isAnagram(word1 : String, word2 : String) : Boolean{

    if(!word1.lowercase().equals(word2.lowercase())) {
        return word1.lowercase().toCharArray().sortedArray().contentEquals(word2.lowercase().toCharArray().sortedArray())
    }
    else{
        println("Las palabras introducidas son iguales")
        return false
    }
}