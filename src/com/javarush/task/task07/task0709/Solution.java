package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        int len = 0;
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            str.add(reader.readLine());
        }

        len = str.get(0).length();

        for (int i = 1; i < str.size(); i++){
            if (str.get(i).length() < len)
                len = str.get(i).length();
        }

        for (int i = 0; i < str.size(); i++){
            if (str.get(i).length() == len)
                System.out.println(str.get(i));
        }
    }
}
