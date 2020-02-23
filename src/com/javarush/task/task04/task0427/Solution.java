package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);

        if (a < 10 && a > 0 && a % 2 == 0)
            System.out.println("четное однозначное число");
        else if (a < 10 && a > 0 && a % 2 != 0)
            System.out.println("нечетное однозначное число");

        else if (a >= 10 && a < 100 && a % 2 == 0)
            System.out.println("четное двузначное число");
        else if (a >= 10 && a < 100 && a % 2 != 0)
            System.out.println("нечетное двузначное число");


        else if (a >= 100 && a < 1000 && a % 2 == 0)
            System.out.println("четное трехзначное число");
        else if (a >= 100 && a < 1000 && a % 2 != 0)
            System.out.println("нечетное трехзначное число");

    }
}
