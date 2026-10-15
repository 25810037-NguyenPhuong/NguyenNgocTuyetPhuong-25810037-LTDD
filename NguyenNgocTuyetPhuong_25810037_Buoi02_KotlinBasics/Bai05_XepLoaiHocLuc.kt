fun main() {
    val diemTrungBinh: Double = 7.8

    val xepLoai = when (diemTrungBinh) {
        in 9.0..10.0 -> "Xuất sắc"
        in 8.0..8.99 -> "Giỏi"
        in 6.5..7.99 -> "Khá"
        in 5.0..6.49 -> "Trung bình"
        in 0.0..4.99 -> "Yếu"
        else -> "Điểm không hợp lệ"
    }

    println("Điểm trung bình: $diemTrungBinh")
    println("Xếp loại: $xepLoai")
}
