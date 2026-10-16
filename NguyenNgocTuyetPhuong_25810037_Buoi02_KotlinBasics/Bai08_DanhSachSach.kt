// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
fun main() {
    val danhSachSach = mutableListOf(
        "Dế Mèn Phiêu Lưu Ký",
        "Tắt Đèn",
        "Số Đỏ",
        "Lão Hạc",
        "Nhà Giả Kim"
    )

    println("Danh sách ban đầu: $danhSachSach")

    danhSachSach.add("Đắc Nhân Tâm")
    danhSachSach.add("Cho Tôi Xin Một Vé Đi Tuổi Thơ")

    danhSachSach.remove("Tắt Đèn")

    danhSachSach.sort()

    println("Danh sách sau khi thêm, xoá, sắp xếp: $danhSachSach")
}
