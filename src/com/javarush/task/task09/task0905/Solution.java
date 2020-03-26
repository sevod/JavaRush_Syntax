package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int depth;
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Thread.currentThread().getStackTrace()[i].getMethodName());
//        }
        depth = Thread.currentThread().getStackTrace().length;
        System.out.println(depth);
        return depth;
    }
}

