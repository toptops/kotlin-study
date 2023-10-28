package toptops.kotlin.study.chap1.section3

fun main() {
    // 와우 쉬엣!!!! 미친 언어다
    namedParam(x = 200, z = 100)
    namedParam(y = 200)
}

fun namedParam(x: Int = 100, y: Int = 100, z: Int = 100) {
    println(x + y + z)
}