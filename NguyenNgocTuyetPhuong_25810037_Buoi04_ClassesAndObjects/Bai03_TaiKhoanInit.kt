// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tạo tài khoản $soTaiKhoan thành công, số dư ban đầu: $soDuBanDau")
        }
    }
}

fun main() {
    val taiKhoan1 = TaiKhoanNganHang("0123456789", 2000000.0)
    val taiKhoan2 = TaiKhoanNganHang("9876543210", -500000.0)
}
