package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if (a == b && a == c)
            System.out.println("" + a + " " + b + " " + c);
        else if (a == b)
            System.out.println("" + a + " " + b);
        else if (a == c)
            System.out.println("" + a + " " + c);
        else if (b == c)
            System.out.println("" + b + " " + c);
    }
}