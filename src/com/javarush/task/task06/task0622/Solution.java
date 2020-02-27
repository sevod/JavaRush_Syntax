package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        int n5 = Integer.parseInt(reader.readLine());

        while (!(n1 <= n2 && n2 <= n3 && n3 <= n4 && n4 <= n5)) {
            int m;
            if (n1 > n2) {
                m = n1;
                n1 = n2;
                n2 = m;

            }
            if (n2 > n3) {
                m = n2;
                n2 = n3;
                n3 = m;
            }
            if (n3 > n4) {
                m = n3;
                n3 = n4;
                n4 = m;
            }

            if (n4 > n5) {
                m = n4;
                n4 = n5;
                n5 = m;
            }
        }
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }

}
