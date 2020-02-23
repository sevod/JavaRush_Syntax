package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int sum = 0;
        while (a != -1) {
            String s1 = reader.readLine();
            a = Integer.parseInt(s1);
            sum += a;
        }
        System.out.println(sum);
    }
}
