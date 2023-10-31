package toptops.kotlin.study.chap.section4

fun main() {
    fun greet() = fun() { println("hello") }
    greet()()
}

