package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for (int i = 0; i < s.length(); i++){
            int num = Integer.parseInt(s.substring(i, i + 1));
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
