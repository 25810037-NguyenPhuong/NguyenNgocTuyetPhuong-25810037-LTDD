// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
fun xuLyTenKhachHang(tenKhachHang: String?) {
    // safe call: neu ten la null thi ket qua la null, khong bi loi
    val doDai = tenKhachHang?.length
    println("Độ dài tên (safe call): $doDai")

    // Elvis: neu ten la null thi dung ten mac dinh
    val tenHienThi = tenKhachHang ?: "Khách vãng lai"
    println("Tên hiển thị (Elvis): $tenHienThi")
}

fun main() {
    println("--- Trường hợp có tên ---")
    xuLyTenKhachHang("Nguyễn Văn An")

    println("--- Trường hợp tên null ---")
    xuLyTenKhachHang(null)

    println("--- Minh hoạ toán tử !! ---")
    val tenChacChan: String? = "Trần Thị Bình"
    // !! ep bien nullable thanh khong null. Neu bien la null thi chuong trinh
    // se nem NullPointerException va dung lai khi chay, nen chi dung khi
    // chac chan tuyet doi bien khong null
    val doDai = tenChacChan!!.length
    println("Độ dài tên (!!): $doDai")

    val tenRong: String? = null
    try {
        println(tenRong!!.length)
    } catch (e: NullPointerException) {
        println("Lỗi khi dùng !! với biến null: NullPointerException")
    }
}
