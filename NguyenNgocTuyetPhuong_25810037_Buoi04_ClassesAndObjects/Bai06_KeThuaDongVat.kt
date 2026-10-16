// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
open class DongVat(val ten: String) {
    open fun keu(): String {
        return "..."
    }
}

class Cho(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Gâu gâu"
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun keu(): String {
        return "Meo meo"
    }
}

fun main() {
    val danhSachDongVat = listOf(Cho("Mực"), Meo("Mướp"), Cho("Vàng"), Meo("Miu"))

    for (dongVat in danhSachDongVat) {
        println("${dongVat.ten} kêu: ${dongVat.keu()}")
    }
}
