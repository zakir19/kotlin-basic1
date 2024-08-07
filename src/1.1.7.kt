fun main() {
    val num = 5
    println("Factorial of $num is: ${factorial(num)}")
    println("trailrec Factorial of $num is: ${factorial(num)}")
}

fun factorial(n: Int): Int {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

tailrec fun factorial(n: Int, accumulator: Int = 1): Int {
    return if (n <= 1) {
        accumulator
    } else {
        factorial(n - 1, n * accumulator)
    }
}