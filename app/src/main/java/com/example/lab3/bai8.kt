package com.example.lab3

fun main() {
    val theMuonList = mutableListOf<TheMuon>()

    val themuon1 = TheMuon(
        SinhVien("Nguyễn Văn A", 30, "P407"),
        "pi88888",
        12,
        15,
        "kkkkkkkk"
    )

    theMuonList.add(themuon1)

    while (true) {
        println("\nChọn chức năng:")
        println("1. Thêm thẻ mượn")
        println("2. Hiển thị danh sách thẻ mượn")
        println("3. Xóa thẻ mượn")
        println("4. Thoát")

        print("Nhập lựa chọn: ")
        val luaChon = readLine()!!.toInt()

        when (luaChon) {
            1 -> themTheMuon(theMuonList)
            2 -> hienThiTheMuon(theMuonList)
            3 -> xoaTheMuon(theMuonList)
            4 -> break
            else -> println("Lựa chọn không hợp lệ!")
        }
    }

    println("Thoát chương trình!")
}