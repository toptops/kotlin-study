package toptops.kotlin.study.chap.section4

fun main() {
    print("Enter tho score: ")
    val score = 95.0
    var grade = 'N'

    when(score) {
        in 90.0.. 100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        !in 70.0.. 100.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}