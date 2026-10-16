// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
abstract class PhuongTienDiChuyen {
    abstract val tocDoToiDa: Int

    fun moTa() {
        println("Phương tiện này có tốc độ tối đa $tocDoToiDa km/h")
    }
}

class XeMay : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 120
}

class OTo : PhuongTienDiChuyen() {
    override val tocDoToiDa: Int = 200
}

fun main() {
    val xeMay = XeMay()
    val oTo = OTo()

    print("Xe máy: ")
    xeMay.moTa()
    print("Ô tô: ")
    oTo.moTa()
}
