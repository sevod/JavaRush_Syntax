package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
 "21 02 2014".
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }
}
