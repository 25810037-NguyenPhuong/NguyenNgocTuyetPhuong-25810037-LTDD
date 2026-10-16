// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
fun main() {
    val diemSo = arrayOf(7.5, 8.0, 6.5, 9.0, 5.5, 7.0, 8.5, 4.5, 6.0, 9.5)

    var tong = 0.0
    var diemCaoNhat = diemSo[0]
    var diemThapNhat = diemSo[0]

    for (diem in diemSo) {
        tong += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh = tong / diemSo.size

    println("Điểm trung bình cả lớp: $diemTrungBinh")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}
