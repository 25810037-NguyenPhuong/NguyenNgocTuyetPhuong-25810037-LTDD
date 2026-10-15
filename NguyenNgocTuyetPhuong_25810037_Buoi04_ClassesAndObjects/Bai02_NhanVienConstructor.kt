class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    // constructor phu chi nhan ten, goi lai constructor chinh bang this
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV001", "Nguyễn Văn An", 15000000.0)
    val nv2 = NhanVien("Trần Thị Bình")

    // println(nv1.maNhanVien)
    // dong tren se bao loi bien dich vi maNhanVien khong co val/var nen chi la tham so
    // cua constructor, khong phai thuoc tinh cua class, nen khong truy cap duoc tu ben ngoai

    println("Nhân viên 1: ${nv1.ten} - Lương: ${nv1.luongThang}")
    println("Nhân viên 2: ${nv2.ten} - Lương: ${nv2.luongThang}")
}
