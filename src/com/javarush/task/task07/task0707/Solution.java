package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Forth");
        arrayList.add("Fifth");

        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
    }
}
