package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 9; i >= 0; i -- ){
            System.out.println(array[i]);
        }
    }
}

