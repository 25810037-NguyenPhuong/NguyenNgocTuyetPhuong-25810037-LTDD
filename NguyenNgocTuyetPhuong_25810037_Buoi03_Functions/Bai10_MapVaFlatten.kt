fun main() {
    println("--- Phần 1: map ---")
    val danhSachSo = listOf(1, 2, 3, 4, 5)
    val nhanDoi = danhSachSo.map { it * 2 }
    println("Danh sách ban đầu: $danhSachSo")
    println("Sau khi nhân đôi: $nhanDoi")

    println("--- Phần 2: flatten ---")
    val danhSachLong = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8, 9)
    )
    val danhSachPhang = danhSachLong.flatten()
    println("Danh sách lồng nhau: $danhSachLong")
    println("Sau khi flatten: $danhSachPhang")
}
