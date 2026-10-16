// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

// goi ham o cap cao nhat cua file (ngoai ham main)
val dienTich1 = tinhDienTich(5.0, 3.0)
val dienTich2 = tinhDienTich(12.5, 4.2)

fun main() {
    println("Diện tích hình chữ nhật 5.0 x 3.0 = $dienTich1")
    println("Diện tích hình chữ nhật 12.5 x 4.2 = $dienTich2")
}
