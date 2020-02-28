package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] array = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 15; i++ ){
            if (i % 2 == 0)
                sum1 += array[i];
            else
                sum2 += array[i];
        }

        if (sum1 > sum2)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
