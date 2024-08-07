fun main() {
    val integer: Int = 10
    println("Integer value is: $integer")
    val double: Double = integer.toDouble()
    println("Integer to double: $double")

    val string: String = "10"
    val integer1: Int = string.toInt()
    println("string to integer: $integer1")

    val string2: String = "11.12"
    val double2: Double = string.toDouble()
    println("String to double: $double2")
}