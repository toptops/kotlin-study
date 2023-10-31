package toptops.kotlin.study.chap.section2

fun main() {
    val num = 256
    if(num is Int)
        println(num)
    else if(num !is Int)
        println("Not a Int")

    // 이건 별로인거 같은데..?
    val x:Any
    x = "hello"
    if(x is String)
        println(x.length)

    val y: String = x as String
    val y2: String? = x as? String
}