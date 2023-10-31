package toptops.kotlin.study.chap.section2

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    // 3항 연산자를 간단히 표현했네
    println("str1: $str1 length: ${str1?.length ?: -1}")
}