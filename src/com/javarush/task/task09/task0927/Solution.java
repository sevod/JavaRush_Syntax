package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>();

        cats.put("vaska", new Cat("vaska"));
        cats.put("vaska2", new Cat("vaska2"));
        cats.put("vaska3", new Cat("vaska3"));
        cats.put("vaska4", new Cat("vaska4"));
        cats.put("vaska5", new Cat("vaska5"));
        cats.put("vaska6", new Cat("vaska6"));
        cats.put("vaska7", new Cat("vaska7"));
        cats.put("vaska8", new Cat("vaska8"));
        cats.put("vaska9", new Cat("vaska9"));
        cats.put("vaska10", new Cat("vaska10"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
       Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> pair: map.entrySet()) {
            cats.add(pair.getValue());
        }

       return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
