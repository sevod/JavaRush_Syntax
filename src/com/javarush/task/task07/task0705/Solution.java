package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i ++ ){
            array2[i] = array[i];
            array3[i] = array[i + 10];
            System.out.println(array[i + 10]);
        }
    }
}
