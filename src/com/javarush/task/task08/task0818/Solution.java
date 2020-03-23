package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 200);
        map.put("Ivanov2", 300);
        map.put("Ivanov3", 400);
        map.put("Ivanov4", 500);
        map.put("Ivanov5", 600);
        map.put("Ivanov6", 700);
        map.put("Ivanov7", 800);
        map.put("Ivanov8", 900);
        map.put("Ivanov9", 1000);
        map.put("Ivanov10", 2000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}