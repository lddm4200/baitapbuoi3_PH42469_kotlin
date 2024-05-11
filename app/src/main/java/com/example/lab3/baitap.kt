package com.example.lab3

fun main(){
    val soA: Int = 5
    val soB: Int = 10
    val tong = tinhTong(soA!!,soB!!)
    val hieu = tinhHieu(soA!!,soB!!)
    println("Tong: "+tong)
    println("hieu: "+hieu)
    println("binh phuong: "+ binhPhuoong(soA))
    println("Thuong: "+ tinhThuong(soA.toFloat(),soB.toFloat() )())

    val ten= "pham minh hieu"
    println("In hoa: "+inHoa(ten))

    val length = ten.let {
    val l =  it.length
        l
    }
    println("chuoi: "+length)
    val a2 = soA.run {
        val kq=this*2
        kq
    }
    println("Nhan doi"+a2)
}


val inHoa :(String) -> String= String :: uppercase

val tinhTong:(Int,Int)-> Int ={soA:Int ,soB:Int-> (soA+soB)}
val tinhHieu:(Int,Int)-> Int ={soA:Int ,soB:Int-> (soA-soB)}

val binhPhuoong:(Int)->Int={it*it}

val tinhThuong = {soA:Float,soB:Float->{
    if(soB==0f){
        "so bi chia phai  khac 0"
    }else{
        val c = soA/soB
        c
    }
}}