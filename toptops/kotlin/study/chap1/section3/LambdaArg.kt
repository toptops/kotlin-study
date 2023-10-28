package toptops.kotlin.study.chap1.section3

fun main() {
    // ㄷㄷㄷ
    lambdaTest{"kotlin $it"}
}

fun lambdaTest(out: (String) -> String) = println(out("BOB"))