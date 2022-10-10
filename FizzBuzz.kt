fun main(args: Array<String>){

    for(i in 0..100){
        if(i % 3 == 0){
            println("$i: Fizz")
        }
        if(i % 5 == 0){
            println("$i: Buzz")
        }
        if(i % 3 == 0 && i % 5 == 0){
            println("$i: FizzBuzz")
        }
        else {
            println("$i: $i")
        }
    }
}
