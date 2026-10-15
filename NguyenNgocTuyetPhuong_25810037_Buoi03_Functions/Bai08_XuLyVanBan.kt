fun xuLyVanBan(vanBan: String, hamXuLy: (String) -> String): String {
    return hamXuLy(vanBan)
}

// ham dat ten rieng, dung cho cach goi thu hai
fun vietHoa(chuoi: String): String {
    return chuoi.uppercase()
}

fun main() {
    val vanBan = "hoc lap trinh kotlin"

    // cach 1: truyen lambda truc tiep tai cho
    val ketQua1 = xuLyVanBan(vanBan, { chuoi -> chuoi.reversed() })
    println("Đảo ngược: $ketQua1")

    // cach 2: truyen ham da dat ten bang toan tu ::
    val ketQua2 = xuLyVanBan(vanBan, ::vietHoa)
    println("Viết hoa: $ketQua2")

    // cach 3: dua lambda ra ngoai dau ngoac (trailing lambda)
    val ketQua3 = xuLyVanBan(vanBan) { chuoi ->
        chuoi.replace(" ", "_")
    }
    println("Thay khoảng trắng: $ketQua3")
}
