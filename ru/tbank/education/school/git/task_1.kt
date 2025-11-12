fun sumEvenNumbers() {
    println("Введите количество чисел:")
    val num = readLine()!!.toInt()
    var valCount = 0
    for (i in 1..num) {
        println("Введите число:")
        val value_n = readLine()!!.toInt()
        if (value_n % 2 == 0) {
            valCount += value_n
        }
    }
    println(valCount)
}
