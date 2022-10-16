package `14`

import java.util.Scanner

fun printClass(arr: List<FirstSemester>) {
    arr.forEach { print("${it.name} ")}
}
fun main() {
    val info: SemInfo = SemInfo()
    // input и проверка на integer
    val objInput = Scanner(System.`in`)
    when (objInput.nextInt()) {
        1 -> {
            print("1 семестр: \n")
            printClass(info.frSemArr)

        }
        2 -> {
            print("2 семестр: \n")
            printClass(info.scSemArr)
        }
        3 -> {
            print("3 семестр: \n")
            printClass(info.thSemArr)
        }

    }

}


