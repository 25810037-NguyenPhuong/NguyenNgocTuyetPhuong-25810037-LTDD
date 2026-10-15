class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le")
        } else {
            println("Tạo tài khoản $soTaiKhoan thành công, số dư ban đầu: $soDuBanDau")
        }
    }

    fun napTien(soTien: Double) {
        soDu = soDu + soTien
    }

    fun rutTien(soTien: Double): Boolean {
        if (soDu >= soTien) {
            soDu = soDu - soTien
            return true
        }
        return false
    }
}

fun main() {
    val taiKhoan = TaiKhoanNganHang("0123456789", 1000000.0)

    taiKhoan.napTien(500000.0)
    println("Nạp 500000 -> Số dư: ${taiKhoan.soDu}")

    val ketQua1 = taiKhoan.rutTien(300000.0)
    println("Rút 300000 -> Thành công: $ketQua1 - Số dư: ${taiKhoan.soDu}")

    val ketQua2 = taiKhoan.rutTien(5000000.0)
    println("Rút 5000000 -> Thành công: $ketQua2 - Số dư: ${taiKhoan.soDu}")

    taiKhoan.napTien(200000.0)
    println("Nạp 200000 -> Số dư: ${taiKhoan.soDu}")
}
