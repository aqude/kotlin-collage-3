package `16`

fun main() {
    var info: Info = Info()
    info.fioArr.forEach {
        println("${it.secondName} ${it.year} ")
    }
    println("=====================================")
    info.fioArr.sortedBy { it.secondName }.forEach { println("${it.secondName} ${it.year}") }
}
