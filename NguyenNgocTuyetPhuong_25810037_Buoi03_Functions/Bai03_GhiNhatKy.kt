// ban khai bao tuong minh kieu tra ve Unit
fun ghiNhatKy(hanhDong: String): Unit {
    println("[NHẬT KÝ] $hanhDong")
}

// ban bo qua khai bao kieu tra ve
fun ghiNhatKyRutGon(hanhDong: String) {
    println("[NHẬT KÝ] $hanhDong")
}

// hai cach tuong duong vi khi khong ghi kieu tra ve, Kotlin tu hieu ham tra ve Unit

fun main() {
    ghiNhatKy("Đăng nhập hệ thống")
    ghiNhatKyRutGon("Đăng nhập hệ thống")
}
