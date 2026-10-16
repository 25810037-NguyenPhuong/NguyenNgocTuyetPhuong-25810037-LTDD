// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
fun main() {
    // dung val vi so du ban dau chi de doi chieu, khong bao gio thay doi
    val soDuBanDau: Long = 5000000
    // dung var vi so du hien tai thay doi sau moi giao dich
    var soDuHienTai: Long = soDuBanDau

    println("Số dư ban đầu: $soDuBanDau đồng")

    soDuHienTai = soDuHienTai + 2000000
    println("Sau khi gửi 2.000.000: $soDuHienTai đồng")

    soDuHienTai = soDuHienTai - 1500000
    println("Sau khi rút 1.500.000: $soDuHienTai đồng")

    println("Chênh lệch so với ban đầu: ${soDuHienTai - soDuBanDau} đồng")
}
