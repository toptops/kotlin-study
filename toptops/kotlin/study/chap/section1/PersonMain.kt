package toptops.kotlin.study.chap.section1

fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20

    println("intro: $intro, num: $num")

    val user = Person("보라돌이", 44)
    println("User name: ${user.name}, age: ${user.age}")
}