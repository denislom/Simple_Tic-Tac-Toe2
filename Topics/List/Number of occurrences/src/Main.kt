fun main() {
    val strings = readln().split(' ')
    val str = readln()
    println(solution(strings, str))
}

fun solution(strings: List<String>, str: String): Int {
    // put your code here
    return strings.count { it == str }
}