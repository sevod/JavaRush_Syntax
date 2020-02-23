package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);

        int num = 0;
        if (a < 0)
            num++;
        if (b < 0)
            num++;
        if (c < 0)
            num++;
        System.out.println("количество отрицательных чисел: " + num);

        int num2 = 0;
        if (a > 0)
            num2++;
        if (b > 0)
            num2++;
        if (c > 0)
            num2++;
        System.out.println("количество положительных чисел: " + num2);

    }
}
