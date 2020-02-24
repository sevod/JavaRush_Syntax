package com.javarush.task.task05.task0526;



public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("sdf", 12, "were");
        Man man2 = new Man("sdfww", 12, "were");
        Woman woman1 = new Woman("sdf", 12, "were");
        Woman woman2 = new Woman("sdfww", 12, "were");
        System.out.println(man1.getName());
        System.out.println(man2.getName());
        System.out.println(woman1.getName());
        System.out.println(woman2.getName());
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String  getName() {
            return name + " " + age + " " + address;
        }

    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String  getName() {
            return name + " " + age + " " + address;
        }
    }
}
