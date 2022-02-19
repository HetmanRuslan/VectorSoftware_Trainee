package com.trainee;

import java.util.Scanner;

import static com.trainee.DigitIncrement.add_digit;
import static com.trainee.EncDec.Decoded;
import static com.trainee.EncDec.Encoded;

public class Main {
    public static void main(String[] args) {

        //Task 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1 \n Enter the string-->");
        String text = sc.nextLine();
        System.out.println("Enter the key-->");
        int key = sc.nextInt();

        String en = Encoded(text,key);
        String de = Decoded(en,key);
        System.out.println("Encoded string is "+en);
        System.out.println("Decoded string is "+de);


        //Task 2

        System.out.println("\nTask 2 \nEnter a digit:");
        Integer num = sc.nextInt();

        add_digit(num);




    }


    }
