package toptops.kotlin.study.chap.section3

fun main() {
    normalVarargs(1, 2, 3, 4, 5)
    normalVarargs(6, 7, 8)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        print("$num ")
    }
    println()
}