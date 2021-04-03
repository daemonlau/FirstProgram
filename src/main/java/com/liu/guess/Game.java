package com.liu.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secert = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(number != secert){
            System.out.print("Please input a number: ");
            number = scanner.nextInt();
            if (number < secert){
                System.out.print("Please higher: ");
            }else if(number > secert) {
                System.out.print("Please lowwer");
            }else {
                 System.out.print("You got it!!");

            }
//            System.out.println(number);
        }
//        int i = 0;
//        do {
//            i++;
//            System.out.println(i);
//        }while(i < 3);
    }
}
