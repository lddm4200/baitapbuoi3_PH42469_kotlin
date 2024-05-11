package com.example.lab3

class TheMuon(
    val sinhVien: SinhVien,
    val maPhieuMuon: String,
    val ngayMuon: Int,
    val hanTra: Int,
    val soHieuSach: String
) {
    fun inThongTin() {
        println("Họ tên: ${sinhVien.hoTen}")
        println("Tuổi: ${sinhVien.tuoi}")
        println("Lớp: ${sinhVien.lop}")
        println("Mã phiếu mượn: $maPhieuMuon")
        println("Ngày mượn: $ngayMuon")
        println("Hạn trả: $hanTra")
        println("Số hiệu sách: $soHieuSach")
    }
}

fun themTheMuon(theMuonList: MutableList<TheMuon>) {
    print("Nhập họ tên sinh viên: ")
    val hoTen = readLine()!!
    print("Nhập tuổi sinh viên: ")
    val tuoi = readLine()!!.toInt()
    print("Nhập lớp sinh viên: ")
    val lop = readLine()!!
    print("Nhập mã phiếu mượn: ")
    val maPhieuMuon = readLine()!!
    print("Nhập ngày mượn: ")
    val ngayMuon = readLine()!!.toInt()
    print("Nhập hạn trả: ")
    val hanTra = readLine()!!.toInt()
    print("Nhập số hiệu sách: ")
    val soHieuSach = readLine()!!

    val sinhVien = SinhVien(hoTen, tuoi, lop)
    val theMuon = TheMuon(sinhVien, maPhieuMuon, ngayMuon, hanTra, soHieuSach)

    theMuonList.add(theMuon)

    println("Thêm thẻ mượn thành công!")
}

fun xoaTheMuon(theMuonList: MutableList<TheMuon>) {
    print("Nhập mã phiếu mượn cần xóa: ")
    val maPhieuMuon = readLine()!!

    theMuonList.removeIf { it.maPhieuMuon == maPhieuMuon }

    println("Xóa thẻ mượn thành công!")
}
fun hienThiTheMuon(theMuonList: MutableList<TheMuon>) {
    if (theMuonList.isEmpty()) {
        println("Danh sách thẻ mượn trống!")
    } else {
        println("Danh sách thẻ mượn:")
        theMuonList.forEach { it.inThongTin() }
    }
}