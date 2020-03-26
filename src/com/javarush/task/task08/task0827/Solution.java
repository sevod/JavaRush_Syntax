package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date beginningYear = new Date(0);
        beginningYear.setYear(date1.getYear());
        int seconds = 24 * 60 * 60 * 1000;
        long day = (date1.getTime() - beginningYear.getTime()) / seconds;

        if (day % 2 == 0)
            return true;
        else
            return false;
     }
}
