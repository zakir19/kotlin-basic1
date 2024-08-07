fun arthoper(a: Double, b: Double, c: Double, oper: Char): Double {
    return when (oper) {
        '+' -> a + b + c
        '-' -> a - b - c
        '*' -> a * b * c
        '/' -> a / b / c
        else -> throw IllegalArgumentException("Invalid operator")
    }
}

fun main() {
    val a = 111.0
    val b = 2222.0
    val c = -222.0

    println("Addition: ${arthoper(a, b, c, '+')}")
    println("Subtraction: ${arthoper(a, b, c, '-')}")
    println("Multiplication: ${arthoper(a, b, c, '*')}")
    println("Division: ${arthoper(a, b, c, '/')}")
}
