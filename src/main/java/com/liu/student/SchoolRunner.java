package com.liu.student;

import com.kotlin.StudentK;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        StudentK.getPass();
        Student.pass=50;
//        userInput();
        Student stu = new Student("John",88,77 );
        Student stu2 = new Student("Eric",60,40 );
        Student stu3 = new Student("Jane",30,40 );
        GraduateStudent gstu = new GraduateStudent("Jack",65,60,70);
        gstu.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High Score: " + stu.highest());
    }

    private static void userInput() {
        System.out.print("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter student's english: ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math: ");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math );
        stu.print();
        System.out.println("High Score: " + stu.highest());
    }
}
