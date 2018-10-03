package greetings

fun main(args: Array<String>) {
    println(TypeSafelyBuiltApp.loadGreeting())
}


object TypeSafelyBuiltApp {

    fun loadGreeting() =
            javaClass.classLoader.getResource("greeting.txt").readText()
}
