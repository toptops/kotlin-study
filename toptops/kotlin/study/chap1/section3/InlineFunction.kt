package toptops.kotlin.study.chap1.section3

fun main() {
    // 허허? 이게 잘 쓰이려나?
    shortFunc(3) { println("First call: $it") }
    shortFunc(5) { println("Second call: $it") }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}