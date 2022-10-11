/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y
 * retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

fun main() {

    var area : Float

    val square = Square(3.5F)
    area = polygonArea(square)
    println("Area of the square = $area u ")

    val triangle = Triangle(2.5F, 4F)
    area = polygonArea(triangle)
    println("Area of the triangle = $area u ")

    val rectangle = Rectangle(2F, 3F)
    area = polygonArea(rectangle)
    println("Area of the rectangle = $area u ")

}


private fun polygonArea(polygon: Polygon) : Float{
    return polygon.area()
}

interface Polygon{
    fun area() : Float
}

class Triangle(base : Float, height : Float) : Polygon{
    var base = base
    var height = height

    override fun area() : Float{
        return base * height / 2
    }
}

class Square(side : Float) : Polygon{
    var side = side

    override fun area() : Float{
        return side * side
    }
}

class Rectangle(length : Float, width : Float) : Polygon{
    var length = length
    var width = width

    override fun area() : Float{
        return length * width
    }
}

