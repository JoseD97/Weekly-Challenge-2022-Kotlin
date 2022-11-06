/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 */

var words : MutableList<String> = mutableListOf()

fun main(){
    var str = "Esta cadena, esta cadena cadena hola Hola pedro."
    wordCounter(str)
}

private fun wordCounter(str : String){
    var cont = 0
    var uniqueWords : MutableList<String> = mutableListOf()
    var numRep : MutableList<Int> = mutableListOf()
    var isUnique : Boolean

    splitInWords(str)       // Split the words individually

    // Count the same words
    for(i in 0 until words.size) {
        cont = 0
        isUnique = true

        for (k in 0..i) {       // Look for other same words
            if (words[i] == uniqueWords.elementAtOrNull(k)) {
                isUnique = false
            }
        }

        if(isUnique){       // Count the number of repetitions of each word
            uniqueWords.add(words[i])
            for (j in 0 until words.size) {
                if (words[i] == words[j]) cont++
            }
            numRep.add(cont)
        }

    }

    for(l in 0 until uniqueWords.size) println("The word '${uniqueWords[l]}' repeats ${numRep[l]} times")

}

private fun splitInWords(str : String) : MutableList<String>{
    var aux = ""

    for(i in str.indices){
        if(str[i].isWhitespace() || str[i] == ',' || str[i] == '.' || str[i] == '?' || str[i] == '!' ){
            if(aux != "") {
                words.add(aux.lowercase())
                aux = ""
            }
        }
        else aux += str[i]
    }

    return words
}