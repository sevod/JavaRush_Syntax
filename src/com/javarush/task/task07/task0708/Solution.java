package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        int maxlen;

        maxlen = 0;
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < 5; i++){
            if (strings.get(i).length() > maxlen)
                maxlen = strings.get(i).length();
        }
        for (int i = 0; i < 5; i++){
            if (strings.get(i).length() == maxlen)
                System.out.println(strings.get(i));
        }
    }
}
