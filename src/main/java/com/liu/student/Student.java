package com.liu.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60 ;

    public int highest(){
//        int max = (english > math) ? english : math ;
//        if (english > math){
//            max = english;
//        } else {
//            max = math;
//        }
        return (english > math) ? english : math;
    }
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        int average = getAverage();
        System.out.println(name + "\t" +english + "\t" + math +
                "\t" + getAverage() + ((getAverage()>=pass) ? "\tPass" : "\tFailed"));
        char grade= 'F';
        switch (average/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("\t" + grade);
//        if (getAverage() >= 60){
//            System.out.println("\tPass");
//        }else{
//            System.out.println("\tFailed");
//        }
    }
    public int getAverage(){
        return (english + math) / 2;
    }

}
