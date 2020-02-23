package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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

        if ((a <= b && a >= c) || (a >= b && a <= c))
        System.out.println(a);
        else if ((b <= a && b >= c) || (b >= a && b <= c))
            System.out.println(b);
        else
            System.out.println(c);

    }
}
