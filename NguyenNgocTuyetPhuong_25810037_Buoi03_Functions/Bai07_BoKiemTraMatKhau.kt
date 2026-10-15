fun main() {
    val kiemTraDoDai: (String) -> Boolean = { matKhau -> matKhau.length >= 8 }

    val matKhau1 = "abc123"
    val matKhau2 = "matkhau123"
    val matKhau3 = "12345678"

    println("$matKhau1 đủ độ dài: ${kiemTraDoDai(matKhau1)}")
    println("$matKhau2 đủ độ dài: ${kiemTraDoDai(matKhau2)}")
    println("$matKhau3 đủ độ dài: ${kiemTraDoDai(matKhau3)}")
}
