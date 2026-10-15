class SanPham(val tenSanPham: String, val gia: Double, val soLuongTonKho: Int = 0)

fun main() {
    // truyen du ba gia tri theo dung thu tu
    val sanPham1 = SanPham("Bàn phím cơ", 850000.0, 15)
    // chi truyen hai tham so bat buoc bang named argument
    val sanPham2 = SanPham(tenSanPham = "Chuột không dây", gia = 320000.0)

    println("Sản phẩm 1: ${sanPham1.tenSanPham} - Giá: ${sanPham1.gia} - Tồn kho: ${sanPham1.soLuongTonKho}")
    println("Sản phẩm 2: ${sanPham2.tenSanPham} - Giá: ${sanPham2.gia} - Tồn kho: ${sanPham2.soLuongTonKho}")
}
