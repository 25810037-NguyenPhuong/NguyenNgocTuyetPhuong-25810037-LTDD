// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Bàn thường") {
    println("Khách hàng: $tenKhachHang - Số khách: $soLuongKhach - Loại bàn: $loaiBan")
}

fun main() {
    // cach 1: dung gia tri mac dinh cua loaiBan
    datBan("Nguyễn Văn An", 2)

    // cach 2: truyen du tham so theo dung thu tu
    datBan("Trần Thị Bình", 4, "Bàn VIP")

    // cach 3: truyen bang ten tham so
    datBan(soLuongKhach = 6, loaiBan = "Bàn ngoài trời", tenKhachHang = "Lê Văn Cường")
}
