package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            try {
                arrayList.add(Integer.parseInt(reader.readLine()));
            }catch (Exception e){
                for (Integer i: arrayList) {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}
