package `14`

data class FirstSemester (
    val name: String
)

class SemInfo {
    val frSemArr = listOf(
        FirstSemester("Русский"),
        FirstSemester("Математика"),
        FirstSemester("Биология"),
        FirstSemester("География"),
    )

    val scSemArr = listOf(
        FirstSemester("Высшая математика "),
        FirstSemester("Системная разработка"),
        FirstSemester("Компьютерная графика"),
        FirstSemester("Вычислительная математика"),
    )

    val thSemArr = listOf(
        FirstSemester("БД"),
        FirstSemester("Тестирование"),
        FirstSemester("ООП"),
        FirstSemester("Английский"),
    )
}
