fun mpg(a: Int, b: Int, c: Int, operation: String): Int {
    return when (operation) {
        "addition" -> a + b + c
        "subtraction" -> a - b - c
        "multiplication" -> a * b * c
        "division" -> b / a
        else -> throw IllegalArgumentException("Invalid operation type.")
    }
}

fun main() {
    val num1 = 111
    val num2 = 2222
    val num3 = -222

    println("Addition of $num1, $num2, $num3 is ${mpg(num1, num2, num3, "addition")}")
    println("Subtraction of $num1, $num2, $num3 is ${mpg(num1, num2, num3, "subtraction")}")
    println("Multiplication of $num1, $num2, $num3 is ${mpg(num1, num2, num3, "multiplication")}")
    println("Division of $num2, $num1,  is ${mpg(num1, num2, num3, "division")}")
}