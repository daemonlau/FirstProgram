package com.liu;

import com.liu.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestTest(){
        Student student=new Student("John",60,80);
        Assertions.assertEquals(80, student.highest());
    }
    @Test
    public void averageTest(){
        Student student=new Student("John",60,80);
        Assertions.assertEquals(70,student.getAverage());
    }
}
