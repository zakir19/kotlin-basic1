fun main() {
    val numbers = arrayOf(10, 90, 60, 80, 100)
    println("using array of:")
    println(numbers.joinToString())

    val numbers1 = Array<Int>(5) { 0 }
    println("using array<>() of:")
    println(numbers1.joinToString())

    val numbers2 = Array<Int>(8) { it }
    println("using array<>() lambda function of:")
    println(numbers2.joinToString())

    val numbers3 = IntArray(5)
    println("using IntArray of:")
    println(numbers3.joinToString())

    val numbers4 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("using intArrayOf of:")
    println(numbers4.joinToString())

    val numbers5 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("using array-6 by using arrayof()")
    println(numbers5.contentDeepToString())






}