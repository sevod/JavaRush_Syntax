package com.javarush.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("asdf");
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("uouoiio");

        ArrayList<String>[] lists;
        lists = new ArrayList[2];
        lists[0] = strings;
        lists[1] = strings1;

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}