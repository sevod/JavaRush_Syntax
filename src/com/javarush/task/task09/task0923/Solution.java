package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> consonant = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] line = string.toCharArray();
        for (char c: line) {
            if (c == ' '){
            }
            else if (isVowel(c)) {
                vowel.add(c);
                vowel.add(' ');
            }
            else {
                consonant.add(c);
                consonant.add(' ');
            }
        }
        for (char c: vowel) {
            System.out.print(c);
        }
        System.out.println();
        for (char c: consonant) {
            System.out.print(c);
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}