package toptops.kotlin.study.chap.section3

fun main() {
    shortFuncReturn(5) {
        println("First call $it")
        return
    }
}

inline fun shortFuncReturn(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}