enum class OperationType {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}

fun calculate(a: Double, b: Double, operation: OperationType = OperationType.ADD): Double? {
    val resultOfCalculation = when (operation) {
        OperationType.ADD -> (a + b)
        OperationType.SUBTRACT -> (a - b)
        OperationType.MULTIPLY -> (a * b)
        OperationType.DIVIDE ->
            if (b == 0.0) {
                null
            } else {
                (a / b)
            }
    }
    return resultOfCalculation
}

fun main() {
    calculate(6.3, 0.0, OperationType.DIVIDE).let {
        println(it)
    }
}
