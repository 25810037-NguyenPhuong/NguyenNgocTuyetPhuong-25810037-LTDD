// Ho ten: Nguyen Ngoc Tuyet Phuong - MSSV: 25810037
fun main() {
    val nhacCu = listOf("Piano", "Guitar", "Violin", "Trống", "Sáo", "Ukulele", "Gong", "Đàn tranh")
    val chuCai = 'G'

    // cach 1: loc thong thuong (eager)
    val ketQuaEager = nhacCu.filter { it.startsWith(chuCai) }
    println("Lọc thông thường: $ketQuaEager")

    // cach 2: loc qua Sequence (lazy)
    val ketQuaLazy = nhacCu.asSequence().filter { it.startsWith(chuCai) }.toList()
    println("Lọc qua Sequence: $ketQuaLazy")

    // nen dung Sequence khi danh sach rat lon hoac co nhieu buoc xu ly noi tiep nhau, de tranh tao danh sach trung gian
}
