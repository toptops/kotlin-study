package toptops.kotlin.study.chap1.section2

fun main() {
//    var str1: String = "Hello Kotlin"
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1 : $str1")

    // ?. <- null을 검사후 null이면 그대로 출력
    println("str1 length: ${str1?.length}")

    // !!. <- null이 아니다! 단정하는 문법
//    println("str1 length: ${str1!!.length}")
}