package toptops.kotlin.study.chap1.section2

typealias Test = String

fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "kotlin"
        println(a + $num)
    """.trimIndent()

    println(formattedString)
    val str: Test = "?"
    println(str)
}