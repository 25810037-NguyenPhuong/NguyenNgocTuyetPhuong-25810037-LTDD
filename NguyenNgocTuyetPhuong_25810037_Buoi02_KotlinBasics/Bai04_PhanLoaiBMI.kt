fun main() {
    val canNang: Double = 65.0
    val chieuCao: Double = 1.70

    val bmi = canNang / (chieuCao * chieuCao)
    val phanLoai: String

    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25) {
        phanLoai = "Bình thường"
    } else if (bmi < 30) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Cân nặng: $canNang kg, chiều cao: $chieuCao m")
    println("Chỉ số BMI: $bmi")
    println("Phân loại: $phanLoai")
}
