package toptops.kotlin.study.chap.section4

fun main() {
    println("Enter the score: ")
    val score = 95.0
    var grade = 'N'

   when {
       score >= 90.0 -> grade = 'A'
       score in 80.0..89.9 -> grade = 'B'
       score < 70.0 -> grade = 'F'
   }
    println("Score: $score, Grade: $grade")
}