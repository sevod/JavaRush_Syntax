package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        float sum = 0;
        int count = 0;
        while (i != -1) {
            String s = reader.readLine();
            i = Integer.parseInt(s);
            if (i != -1) {
                sum += i;
                count++;
            }
        }
        System.out.println(sum / count);
    }
}

