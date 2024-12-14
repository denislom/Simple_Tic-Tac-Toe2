// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    val cars = listOf("BMW", "Honda", "Mercedes")
    val textUsMethod = listOf("SMS", "Email")
    val staff = emptyList<String>()
    println(staff)
    println(textUsMethod)
    println(cars)

    val names = listOf<String>("Emma", "Kim")

    val list = buildList {
        add("Marta")
        addAll(names)
        add("Kira")
    }
    println(list) // output: [Marta, Emma, Kim, Kira]
    println(list.isEmpty())
    println(list.size)
    println("list.get(2): ${list.get(2)}")
    println("list[2]: ${list[2]}")
    println(list.contains("Kira"))
    println(list.indexOf("Kira"))
}
