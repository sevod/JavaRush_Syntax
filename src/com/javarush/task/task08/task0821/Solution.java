package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan1");
        map.put("Ivanov2", "Ivan");
        map.put("Ivanov", "Ivan3");
        map.put("Ivanov4", "Ivan");
        map.put("Ivanov", "Ivan5");
        map.put("Ivanov6", "Ivan6");
        map.put("Ivanov7", "Ivan7");
        map.put("Ivanov8", "Ivan8");
        map.put("Ivanov9", "Ivan9");
        map.put("Ivanov10", "Ivan10");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
