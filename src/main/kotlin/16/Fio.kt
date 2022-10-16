package `16`

data class FioInfo (
    var secondName: String,
    var year: Int
)

class Info {
    val fioArr = listOf(
        FioInfo("Яндексовов", 2015),
        FioInfo("Афонов", 2022),
        FioInfo("Иванов", 1999),
        FioInfo("Петров", 1998),
        FioInfo("Сидоров", 1997),
        FioInfo("Кузнецов", 1996),
    )
}