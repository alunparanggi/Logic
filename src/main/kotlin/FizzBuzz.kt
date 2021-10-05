fun main(){
    print(fizzBuzz(17))
}

fun fizzBuzz(maxNumber: Int): ArrayList<String> {
    val array = ArrayList<String>()
    for(i in 1..maxNumber) {
        when{
            i % 3 == 0 && i % 5 == 0 -> array.add("FizzBuzz")
            i % 3 == 0 -> array.add("Fizz")
            i % 5 == 0 -> array.add("Buzz")
            else -> array.add("$i")
        }
    }
    return array
}