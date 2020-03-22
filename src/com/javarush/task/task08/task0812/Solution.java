package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        int len;
        int max;
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        max = 1;
        len = 1;
        for (int i = 0; i < 9; i++){
            if (list.get(i).equals(list.get(i + 1))){
                len++;
                //System.out.println(max);
            }
            else
                len = 1;
            if (len > max)
                max = len;
        }

        System.out.println(max);
    }
}