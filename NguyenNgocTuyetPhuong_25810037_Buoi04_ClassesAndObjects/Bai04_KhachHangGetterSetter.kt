// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            // tach theo khoang trang cuoi cung: phan truoc la ho, phan sau la ten
            val viTri = value.lastIndexOf(" ")
            ho = value.substring(0, viTri)
            ten = value.substring(viTri + 1)
        }
}

fun main() {
    val khachHang = KhachHang("Nguyễn", "An")
    println("Họ tên ban đầu: ${khachHang.hoTen}")

    khachHang.ten = "Bình"
    println("Sau khi đổi tên: ${khachHang.hoTen}")

    khachHang.hoTen = "Trần Thị Cúc"
    println("Sau khi gán họ tên mới -> Họ: ${khachHang.ho}, Tên: ${khachHang.ten}")
}
