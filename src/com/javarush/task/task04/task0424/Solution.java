package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (a != b && b == c)
            System.out.println(1);
        else if (b != a && a == c)
            System.out.println(2);
        else if (c != a && a == b)
            System.out.println(3);
    }
}
