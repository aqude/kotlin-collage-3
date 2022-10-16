package `18`
import java.util.*

fun main() {
//    print("Введите 5 цифр: ")
//    val (a, b, c, d, e) = readLine()!!.split(" ").map { it.toFloat() }
    // заполнить a, b, c, d, e случайными числами
//    val rand: Float = (0..10).random().toFloat()
//    val arr = FloatArray(5){rand}
    val rnd = Random()
    val arr = FloatArray(10){rnd.nextFloat(0F, 10F)}
    // Заполнить переменные a, b, c, d, e случайными числами
    val result: Float = (arr[0] + arr[1]) * (arr[2] - arr[3]) / arr[4]
    println("======================================") // ===
    println("=  a  =  b  =  c  =  d  =  e  =  Res =") //  Буквы
    println("======================================") // ===
    println("= ${"%.1f".format(arr[0])} = ${"%.1f".format(arr[1])} = ${"%.1f".format(arr[2])} = ${"%.1f".format(arr[3])} = ${"%.1f".format(arr[4])} = ${"%.1f".format(result)} =") // Цифры
    println("======================================") // ===
}