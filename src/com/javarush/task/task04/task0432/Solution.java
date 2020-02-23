package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s2 = reader.readLine();
        int n = Integer.parseInt(s2);

        while (n > 0) {
            System.out.println(s);
            n--;
        }
    }
}
