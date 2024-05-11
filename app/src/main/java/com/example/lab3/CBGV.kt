package com.example.lab3

class CBGV(
    val nguoi: Nguoi,
    val luongCung: Double,
    val luongThuong: Double,
    val tienPhat: Double
) {
    val luongThucLinh: Double
        get() = luongCung + luongThuong - tienPhat

    fun inThongTin() {
        println("Họ tên: ${nguoi.hoTen}")
        println("Tuổi: ${nguoi.tuoi}")
        println("Quê quán: ${nguoi.queQuan}")
        println("Mã số: ${nguoi.maSo}")
        println("Lương cứng: $luongCung")
        println("Lương thưởng: $luongThuong")
        println("Tiền phạt: $tienPhat")
        println("Lương thực lĩnh: $luongThucLinh")
    }


}

fun themCBGV(cbgvList: MutableList<CBGV>) {
    print("Nhập họ tên: ")
    val hoTen = readLine()!!
    print("Nhập tuổi: ")
    val tuoi = readLine()!!.toInt()
    print("Nhập quê quán: ")
    val queQuan = readLine()!!
    print("Nhập mã số: ")
    val maSo = readLine()!!
    print("Nhập lương cứng: ")
    val luongCung = readLine()!!.toDouble()
    print("Nhập lương thưởng: ")
    val luongThuong = readLine()!!.toDouble()
    print("Nhập tiền phạt: ")
    val tienPhat = readLine()!!.toDouble()

    val cbgv = CBGV(
        Nguoi(hoTen, tuoi, queQuan, maSo),
        luongCung,
        luongThuong,
        tienPhat
    )

    cbgvList.add(cbgv)

    println("Thêm cán bộ giáo viên thành công!")
}

fun xoaCBGV(cbgvList: MutableList<CBGV>) {
    print("Nhập mã số cán bộ giáo viên cần xóa: ")
    val maSo = readLine()!!

    cbgvList.removeIf { it.nguoi.maSo == maSo }

    println("Xóa cán bộ giáo viên thành công!")
}

fun hienThiDanhSachCBGV(cbgvList: MutableList<CBGV>) {
    if (cbgvList.isEmpty()) {
        println("Danh sách cán bộ giáo viên trống!")
    } else {
        println("Danh sách cán bộ giáo viên:")
        cbgvList.forEach { it.inThongTin() }
    }
}