package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String str;
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
           str = reader.readLine();
           if (!str.equals("end"))
               strings.add(str);
           else
               break;
        }

        for (int i = 0; i < strings.size(); i++)
            System.out.println(strings.get(i));
    }
}