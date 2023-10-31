package toptops.kotlin.study.chap.section5

class BirdPrimaryInit(
    var name: String,
    var wing: Int,
    var beak: String,
    var color: String
) {
    init {
        println("-----초기화 블록 시작-----")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("-----초기화 블록 끝-----")
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = BirdPrimaryInit("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
}