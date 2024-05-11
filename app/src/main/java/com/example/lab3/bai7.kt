package com.example.lab3

fun main() {
    val cbgvList = mutableListOf<CBGV>()

    val cbgv1 = CBGV(
        Nguoi("Nguyễn Văn A", 30, "Hà Nội", "GV001"),
        10000000.0,
        500000.0,
        100000.0
    )

    val cbgv2 = CBGV(
        Nguoi("Trần Thị B", 35, "Hải Phòng", "GV002"),
        12000000.0,
        800000.0,
        0.0
    )
    cbgvList.add(cbgv1)

    while (true) {
        println("\nChọn chức năng:")
        println("1. Thêm mới cán bộ giáo viên")
        println("2. Hiển thị danh sách cán bộ giáo viên")
        println("3. Xóa cán bộ giáo viên")
        println("4. Thoát")

        print("Nhập lựa chọn: ")
        val luaChon = readLine()!!.toInt()

        when (luaChon) {
            1 -> themCBGV(cbgvList)
            2 -> hienThiDanhSachCBGV(cbgvList)
            3 -> xoaCBGV(cbgvList)
            4 -> break
            else -> println("Lựa chọn không hợp lệ!")
        }
    }

    println("Thoát chương trình!")
}