package com.liu;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        String s = "abcde";
        System.out.println(s.charAt(4));
        System.out.println(s.length());
        Person p = new Person("John", 66.5f, 1.7f);
        p.hello();
        p.height=1.7f;
        p.weight=66.5f;
        p.bmi();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score <= 60);
//        int age = 19;
//        Integer age2=19;
//        char A = 'c';
//        Character B ='C';
//        float weight = 66.6f;
//        byte c = 10;
//        boolean adult = true;
//        String name = "Daemon";


    }
}
