package toptops.kotlin.study.chap.section6

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) {
        property, oldValue, newValue ->
        println("$oldValue : $newValue")
        newValue > oldValue
    }

    println(max)
    max = 10
    println(max)

    max = 5
    println(max)
}