package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int max = 0;
        int min;
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            strings.add(reader.readLine());

        min = strings.get(0).length();

        for (int i = 0; i < 10; i++){
            if (min > strings.get(i).length())
                min = strings.get(i).length();
            if (max < strings.get(i).length())
                max = strings.get(i).length();
        }
        for (int i = 0; i < 10; i++){
            if (min == strings.get(i).length() || max == strings.get(i).length()) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
