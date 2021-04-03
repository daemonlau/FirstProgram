package com.liu

import java.util.*


fun main(args: Array<String>){
    val secret = Random().nextInt(10)+1
    println(secret)
//    val scanner = Scanner(System.`in`)
    var number = 0
    while(number != secret){
        print("Input a number: ")
        number = readLine()!!.toInt()
//        number = scanner.nextInt()
        if (number < secret){
            print("Higher!")
        } else if(number >secret){
            print("Lowwer!")
        } else{
            print("Great! the number is $number !")
        }
    }


}


class Game {

}