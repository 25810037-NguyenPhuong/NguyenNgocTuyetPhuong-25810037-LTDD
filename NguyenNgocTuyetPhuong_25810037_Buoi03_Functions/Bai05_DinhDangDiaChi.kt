fun dinhDangDiaChi(
    soNha: String,
    tenDuong: String,
    phuong: String = "Phường 1",
    quan: String = "Quận 1",
    thanhPho: String = "TP. Hồ Chí Minh"
): String {
    return "$soNha $tenDuong, $phuong, $quan, $thanhPho"
}

fun main() {
    val diaChi1 = dinhDangDiaChi("12", "Nguyễn Huệ", phuong = "Bến Nghé")
    val diaChi2 = dinhDangDiaChi("1", "Võ Văn Ngân", phuong = "Linh Chiểu", quan = "TP. Thủ Đức")
    val diaChi3 = dinhDangDiaChi("45", "Trần Phú", thanhPho = "Đà Nẵng", quan = "Hải Châu", phuong = "Thạch Thang")

    println(diaChi1)
    println(diaChi2)
    println(diaChi3)
}
