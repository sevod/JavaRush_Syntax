package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list0 = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            String s = reader.readLine();
            if (s.isEmpty())
                break;
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0)
                list3.add(list.get(i));
            if (list.get(i) % 2 == 0)
                list2.add(list.get(i));
            if (list.get(i) % 3 != 0 && list.get(i) %2 != 0)
                list0.add(list.get(i));
        }

        printList(list3);
        printList(list2);
        printList(list0);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
