package toptops.kotlin.study.chap1.section3

fun main() {
    shortFuncNoInline(5) { println("First call: $it") }
}

inline fun shortFuncNoInline(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}