// Họ tên: Nguyễn Ngọc Tuyết Phương - MSSV: 25810037
fun main() {
    var a = 0
    var b = 1

    println("Các số Fibonacci nhỏ hơn 100:")
    // day Fibonacci duoi 100 co 12 so nen lap toi da 20 lan la du
    for (viTri in 0..20) {
        if (a >= 100) {
            break
        }
        println("Vị trí $viTri: $a")
        val tiepTheo = a + b
        a = b
        b = tiepTheo
    }
}
