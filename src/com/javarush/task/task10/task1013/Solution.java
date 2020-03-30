package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private int weight;
        private int height;

        public Human(String name){
            this.name = name;
        }

        public Human(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;

        }

        public Human(String name, String surname, boolean sex){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;

        }
        public Human(String name, String surname, int age, boolean sex){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }
        public Human(String surname, int age, boolean sex, int height){
            this.surname = surname;
            this.age = age;
            this.sex = sex;;
            this.height = height;
        }
        public Human(String name, String surname, int age, boolean sex, int weight){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }
        public Human(String name, int age, boolean sex, int weight, int height){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String surname, int age, boolean sex, int weight, int height){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }
    }
}
