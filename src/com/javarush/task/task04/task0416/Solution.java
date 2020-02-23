package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        float t = Float.parseFloat(s);

        if (t >= 5)
            t = t - (int)(t/5)*5;

        if (t < 3)
            System.out.println("зелёный");
        else if (t < 4)
            System.out.println("жёлтый");
        else
            System.out.println("красный" );
    }
}