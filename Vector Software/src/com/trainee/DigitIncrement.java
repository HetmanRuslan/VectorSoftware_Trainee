package com.trainee;

import java.util.ArrayList;
import java.util.Vector;

public class DigitIncrement {
    static public void add_digit(Integer num) {
        ArrayList<Integer> digit = new ArrayList<>();
        while (num>=10){
            digit.add(num%10);
            num/=10;
        }
        digit.add(num);
        System.out.print("Output-->");
        for (int i = digit.size() - 1; i >= 0; --i) {
            System.out.print(digit.get(i) + 1);
        }


    }
}
