fun main() {

    println("Hello World!")

    println("Choose the application (1-6)")
    val input = readLine()
    val value = input?.toIntOrNull()

    when (value){
        1 -> {
            println("Enter any string")

            val input = readLine()!!
            println(task1(input))
        }
        2 -> {
            println("Enter any string")

            val input = readln()
            println(task2(input))
        }
        3 -> {
            println("Enter any integer")

            val input = readln()
            println(task3(input))

        }

        else -> {
            println("Wrong exit")
        }

    }

}

fun task1(input: String): String {
    if (input.isEmpty()) return "the stack is empty"

    var currentChar = input[0]
    var count = 1
    val result = StringBuilder()

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar)
            if (count > 1) result.append(count)
            currentChar = input[i]
            count = 1
        }
    }

    result.append(currentChar)
    if (count > 1) result.append(count)

    return result.toString()
}
fun task2(input: String) {
    val charCount = mutableMapOf<Char, Int>()

    for (char in input) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    val sortedKeys = charCount.keys.sorted()

    for (key in sortedKeys) {
        println("$key - ${charCount[key]}")
    }
}

fun task3(input: ) {


}




