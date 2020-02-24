package com.javarush.task.task05.task0532;

import java.io.*;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n - 1; i++) {
                int a = Integer.parseInt(reader.readLine());
                maximum = a > maximum ? a : maximum;
            }

            System.out.println(maximum);
        }
    }
}
