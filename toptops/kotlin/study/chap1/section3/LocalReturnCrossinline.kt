package toptops.kotlin.study.chap1.section3

fun main() {
    shortFuncCrossInline(5) {
        println("First call $it")
//        return
    }
}

inline fun shortFuncCrossInline(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}