package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i <= 10; i++){
            j = i;
            while (j > 0){
                System.out.print(8);
                j--;
            }
            System.out.println("");

        }
    }
}
