package toptops.kotlin.study.chap1.section3

fun main() {
    val out: () -> Unit = { println("Hello World") }
    out()
    val new = out
    new()
}