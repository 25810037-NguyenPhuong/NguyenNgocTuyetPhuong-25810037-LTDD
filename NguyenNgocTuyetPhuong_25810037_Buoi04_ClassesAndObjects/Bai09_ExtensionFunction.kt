// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
fun String.demNguyenAm(): Int {
    var dem = 0
    for (kyTu in this.lowercase()) {
        if (kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u') {
            dem++
        }
    }
    return dem
}

fun Int.laSoNguyenTo(): Boolean {
    if (this < 2) {
        return false
    }
    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    println("\"Kotlin\" có ${"Kotlin".demNguyenAm()} nguyên âm")
    println("\"HELLO WORLD\" có ${"HELLO WORLD".demNguyenAm()} nguyên âm")
    println("\"Android Studio\" có ${"Android Studio".demNguyenAm()} nguyên âm")

    println("7 là số nguyên tố: ${7.laSoNguyenTo()}")
    println("10 là số nguyên tố: ${10.laSoNguyenTo()}")
    println("1 là số nguyên tố: ${1.laSoNguyenTo()}")
    println("29 là số nguyên tố: ${29.laSoNguyenTo()}")
}
