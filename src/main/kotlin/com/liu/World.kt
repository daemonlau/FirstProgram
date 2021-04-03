package com.liu

fun main(args: Array<String>) {
//    println("Hello kotlin")
    var s:String? = "abcde"
    s=null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    val h = Human(66.5f,1.7f)
    println(h.bmi())
    val score = 88
    println(score > 60)
    val c :Char= 'A'
    println(c.toInt() > 60)
//    h.hello()
//    var age:Int = 19
//    age =20
//    var weight = 66.5f
//    val name = "Demon"
//    var name2 : String
}

class Human(var weight:Float, var height:Float, var name:String=""){
    init{
        println("test $weight")
    }
    fun bmi(): Float{
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello(){
        println("Hello kotlin")

    }
}