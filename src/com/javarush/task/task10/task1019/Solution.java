package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> hashMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int id;
            try {
                id = Integer.parseInt(reader.readLine());
            }catch (Exception e){
                break;
            }
            String name = reader.readLine();
            hashMap.put(name, id);
        }


        for (Map.Entry<String, Integer> pair: hashMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
