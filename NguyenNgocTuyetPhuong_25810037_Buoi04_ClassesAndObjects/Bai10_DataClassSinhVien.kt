// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
data class SinhVien(val mssv: String, val hoTen: String, val diemTrungBinh: Double)

fun main() {
    val sv1 = SinhVien("SV001", "Nguyễn Văn An", 8.5)
    val sv2 = SinhVien("SV001", "Nguyễn Văn An", 8.5)

    println("toString tự sinh: $sv1")
    println("sv1 == sv2: ${sv1 == sv2}")

    val sv3 = sv1.copy(diemTrungBinh = 9.2)
    println("Object tạo bằng copy: $sv3")
}
