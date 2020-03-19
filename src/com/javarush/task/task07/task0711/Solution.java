package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            strings.add(i, reader.readLine());
        }

        for (int i = 0; i < 13; i++){
            strings.add(0, strings.get(4));
            strings.remove(5);
        }

        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }
    }
}
