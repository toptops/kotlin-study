package toptops.kotlin.study.chap.section5

class BirdDefault(
    var name: String = "NONAME",
    var wing: Int = 2,
    var beak: String,
    var color: String
) {}

fun main() {
    val coco = BirdDefault(beak = "long", color = "red")
    println("coco.name: ${coco.name}, coco.wing: ${coco.wing}")
    println("coco.beak: ${coco.beak}, coco.color: ${coco.color}")
}