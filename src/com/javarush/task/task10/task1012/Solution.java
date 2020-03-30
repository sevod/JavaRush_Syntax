package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> mapAlphabet = new HashMap<>();
        for (char c: alphabet) {
            mapAlphabet.put(c, 0);
        }

        for (String str: list) {
            char[] buf = str.toCharArray();
            for (char c: buf) {
                if (alphabet.contains(c))
                    mapAlphabet.put(c, mapAlphabet.get(c) + 1);
            }
        }

        for (char c: alphabet) {
            System.out.println(c + " " + mapAlphabet.get(c));
        }
    }
}
