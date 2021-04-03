package com.kotlin


import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = StudentK("John", 67, 77)
    val gstu = GraduateStudent("Eric",60,65,66)
    stu.print()
    gstu.print()
//    println("High Score:  ${stu.highest()}")
}
class GraduateStudent(name: String?, english: Int, math: Int,var thesis:Int) : StudentK(name, english, math) {
    companion object{
        var pass = 70
    }

    override fun print() {
        print(name + "\t" + english + "\t" +math +
                "\t" + getAverage() + if (getAverage() >= pass) "\tPass" else "\tFailed")
    }
}

open class StudentK(var name:String?, var english: Int, var math: Int) {
    companion object{
        @JvmStatic //節省companion的呼叫方式
        var pass = 60
        fun test(){
            println("Testing")
        }
    }
    open fun print(){
        print(name + "\t" + english + "\t" +math +
                "\t" + getAverage() + if (getAverage() >= pass) "\tPass" else "\tFailed")
        println("\t" + grading())
    }
    fun grading() = when(getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
//        var grading = when(getAverage()){
//            in 90..100 -> 'A'
//            in 80..89 -> 'B'
//            in 70..79 -> 'C'
//            in 60..69 -> 'D'
//            else -> 'F'
//
//        }


    fun getAverage() =(english + math)/2

    fun highest()=if (english > math) english else math
    fun nameCheck() = name?.length
}
private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english: ")
    var english = scanner.nextInt()
    print("Please enter student's math: ")
    var math = scanner.nextInt()
    val stu = StudentK(name, english, math)
    stu.print()
    stu.nameCheck()
}

