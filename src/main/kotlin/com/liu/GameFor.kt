package com.liu

import java.util.*

fun main() {
    val secret = Random().nextInt(10)+1
    val scanner = Scanner(System.`in`)
    for (i in 1..4){
        print("Please input a number(${i}/4): ")
        var number= scanner.nextInt()
        println("第 ${i}次 $number")
        if (number > secret){
            print("Lowwer")
        }else if(number < secret){
            print("Higher")
        } else{
            print("Great! The number is $number.")
            break
        }
        if (number == -1)
            break
    }

}