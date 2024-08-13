fun main() {
    val numbers = arrayListOf(57, 90, 10, 13, 14)
    var maxnum = numbers[0]
    for (number in numbers) {
        if (number > maxnum) {
            maxnum = number
        }
    }
    print("Largest element = $maxnum")
}