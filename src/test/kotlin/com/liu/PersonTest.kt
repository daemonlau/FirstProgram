package com.liu.kotlin

import com.liu.Human
import com.liu.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest(){
        val human = Human(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), human.bmi())
    }

    @Test
    fun personBmiTest(){
        val person = Person("John",66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi())
    }
}