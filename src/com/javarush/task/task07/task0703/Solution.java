package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrayString = new String[10];
        int[] arrayNumber = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            arrayString[i] = s;
            arrayNumber[i] = s.length();
            System.out.println(s.length());
        }
    }
}
