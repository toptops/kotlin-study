package toptops.kotlin.study.chap.section3

fun main() {
    val res1 = funcParam(3, 2, ::sumV2)
    println(res1)

    hello(::text)

    val likeLambda = ::sumV2
    println(likeLambda(6, 6))
}

fun sumV2(a: Int, b: Int) = a + b
fun text(a: String, b: String) = "Hi! $a $b"
fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}
fun hello(body: (String, String) -> String) {
    println(body("Hello", "World"))
}