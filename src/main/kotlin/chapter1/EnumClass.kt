package chapter1

enum class day(val code: String, val codeName: String) {
    MON("MON", "월"),
    TUE("TUE", "화"),
    WEDNES("WEDNES", "수"),
    THUR("THUR", "목"),
    FRI("FRI", "금"),
    SAT("SAT", "토"),
    SUN("SUN", "일")
}

fun main() {
    println("day fri : ${day.FRI.code}, ${day.FRI.codeName}")
    println("day fri : ${day.valueOf("FRI").codeName}")

    day.values().onEach { day -> println("day code : ${day.code}") }

}