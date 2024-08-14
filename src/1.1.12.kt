fun main() {
    println("Without using third variable")
    var A = 10
    var B = 20
    println("Before swaping: A=$A,B=$B")

    A = A + B
    B = A - B
    A = A - B

    println("After swapping: A=$A,B=$B")

    println("with using third variable")
    var a = 10
    var b = 20
    println("Before swapping a=$a,b=$b")

    val temp = a
    a = b
    b = temp

    println("after swapping: a=$a,b=$b")
}