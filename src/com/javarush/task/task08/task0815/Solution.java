package com.javarush.task.task08.task0815;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<String, String>();
        
        map.put("Иванов", "Иван");
        map.put("Иванов2", "Иван2");
        map.put("Иванов3", "Иван3");
        map.put("Иванов4", "Иван4");
        map.put("Иванов5", "Ива5");
        map.put("Иванов6", "Иван6");
        map.put("Иванов7", "Иван7");
        map.put("Иванов8", "Иван8");
        map.put("Иванов9", "Иван9");
        map.put("Иванов10", "Иван10");
        
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count;
        count = 0;

        for (Map.Entry<String, String> people: map.entrySet()) {
            if(people.getValue() == name)
                count++;
        }
        
        return (count);
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count;

        count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey() == lastName)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
