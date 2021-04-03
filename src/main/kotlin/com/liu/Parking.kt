package com.liu.kotlin

import java.time.Duration
import java.time.LocalDateTime

fun main(args:Array<String>){
    val enter = LocalDateTime.of(2021,3,29,8,14,0)
    val leave = LocalDateTime.of(2021,3,29,10,14,0)
    var car =Car("ABC-0648",enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class Car (val id:String, val enter:LocalDateTime){
    var leave: LocalDateTime? = null
    set(value){
        if(enter.isBefore(value)) {
            field = value
        }
    }
    fun duration() = Duration.between(enter, leave).toMinutes()
}