package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s1 = s.split("-");
        Date date = new Date(0);
        date.setMonth(Integer.parseInt(s1[1]) - 1);
        date.setDate(Integer.parseInt(s1[2]));
        date.setYear(Integer.parseInt(s1[0]) - 1900);

        SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(df.format(date).toUpperCase());
    }
}
