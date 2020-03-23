package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Ivanov", "Ivan");
        map.put("Ivanov2", "Ivan2");
        map.put("Ivanov3", "Ivan3");
        map.put("Ivanov4", "Ivan4");
        map.put("Ivanov5", "Ivan5");
        map.put("Ivanov6", "Ivan6");
        map.put("Ivanov7", "Ivan7");
        map.put("Ivanov8", "Ivan8");
        map.put("Ivanov9", "Ivan9");
        map.put("Ivanov10", "Ivan10");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair1 : copy.entrySet()) {
            for (Map.Entry<String, String> pair2 : copy.entrySet()) {
                if (pair1.getKey() != pair2.getKey() && pair1.getValue().equals(pair2.getValue()))
                    removeItemFromMapByValue(map, pair1.getValue());
            }
        }

//        for (Map.Entry<String, String> pair : map.entrySet())
//            System.out.println(pair.getValue());
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
