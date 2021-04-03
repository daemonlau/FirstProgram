package com.liu.student;

public class GraduateStudent extends Student{
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public int getAverage() {
        return (english + math + thesis) / 3;
    }

    @Override
    public void print() {
        int average = getAverage();
        System.out.println(name + "\t" +english + "\t" + math + "\t" +thesis +
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
    }
}
