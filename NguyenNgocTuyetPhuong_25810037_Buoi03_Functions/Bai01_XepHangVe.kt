fun main() {
    val tuoi = 70

    val loaiVe = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi < 60) {
        "Vé người lớn"
    } else {
        "Vé cao tuổi"
    }

    println("Tuổi: $tuoi")
    println("Loại vé: $loaiVe")
}
