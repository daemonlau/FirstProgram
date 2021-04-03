package com.liu

import com.liu.kotlin.Car
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkinLot = HashMap<String,Car?>()
    var enter= LocalDateTime.of(2021,3,31,8,0,0)
    var car:Car? = Car("CAD-0648",enter) //讓car可以是null
    parkinLot.put(car!!.id, car)
    car = Car("BBB-0002",enter.plusMinutes(15))
    parkinLot.put(car!!.id, car)
    // Car1 leaving
    var leave = LocalDateTime.of(2021,3,31,10,0,0)
    car = parkinLot.get("CAD-0648")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()}")
    parkinLot.remove(car?.id)
    println(parkinLot.size)
    // Car2 leaving
    car = parkinLot.get("BBB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}")
    parkinLot.remove(car?.id)
    println(parkinLot.size)

//    val list = listOf(5,1,2,7)
//    println(list)
//    val scores = listOf(68,88,77,85,64)
//    for (score in scores){
//        println(score)
//    }
//    println(list.get(2))
//    var mutablelist = mutableListOf(5,1,2,8)
//    mutablelist.add(6)
//    println(mutablelist)
}
class Many {

}