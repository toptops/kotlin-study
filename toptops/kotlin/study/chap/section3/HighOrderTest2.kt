package toptops.kotlin.study.chap.section3

fun main() {
    val out: () -> Unit = { println("Hello World") }
    out()
    val new = out
    new()
}