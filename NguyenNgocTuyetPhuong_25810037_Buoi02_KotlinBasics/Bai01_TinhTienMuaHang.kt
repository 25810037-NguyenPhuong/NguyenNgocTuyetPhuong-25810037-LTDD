fun main() {
    val soLuong: Int = 3
    val donGia: Double = 125000.0
    val thue = 0.08

    // ep kieu soLuong sang Double truoc khi nhan
    val tienHang = soLuong.toDouble() * donGia
    val tienThue = tienHang * thue
    val tongTien = tienHang + tienThue

    println("Số lượng: $soLuong")
    println("Đơn giá: $donGia VNĐ")
    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế 8%: $tienThue VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
}
