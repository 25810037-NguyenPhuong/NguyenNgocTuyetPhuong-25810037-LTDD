// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
// 1. tinh binh phuong
fun binhPhuong(x: Int): Int {
    return x * x
}
fun binhPhuongRutGon(x: Int): Int = x * x

// 2. tinh chu vi hinh vuong
fun chuViHinhVuong(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

// 3. kiem tra so chan
fun laSoChan(n: Int): Boolean {
    return n % 2 == 0
}
fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0

fun main() {
    println("Bình phương của 7: ${binhPhuong(7)} - rút gọn: ${binhPhuongRutGon(7)}")
    println("Chu vi hình vuông cạnh 2.5: ${chuViHinhVuong(2.5)} - rút gọn: ${chuViHinhVuongRutGon(2.5)}")
    println("10 là số chẵn: ${laSoChan(10)} - rút gọn: ${laSoChanRutGon(10)}")
    println("7 là số chẵn: ${laSoChan(7)} - rút gọn: ${laSoChanRutGon(7)}")
}
