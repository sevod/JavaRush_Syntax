package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();

        Human children1 = new Human();
        children1.name = "children1";
        children1.age = 12;
        children1.sex = true;
        Human children2 = new Human();
        children2.name = "children2";
        children2.age = 12;
        children2.sex = true;
        Human children3 = new Human();
        children3.name = "children3";
        children3.age = 12;
        children3.sex = true;

        Human father = new Human();
        father.name = "father";
        father.age = 32;
        father.sex = true;
        father.children.add(children1);
        father.children.add(children2);
        father.children.add(children3);

        Human mother = new Human();
        mother.name = "father";
        mother.age = 28;
        mother.sex = false;
        mother.children.add(children1);
        mother.children.add(children2);
        mother.children.add(children3);

        Human grandfather1 = new Human();
        grandfather1.name = "grandfather1";
        grandfather1.age = 54;
        grandfather1.sex = true;
        grandfather1.children.add(father);

        Human grandmother1 = new Human();
        grandmother1.name = "grandmother1";
        grandmother1.age = 54;
        grandmother1.sex = false;
        grandmother1.children.add(father);

        Human grandfather2 = new Human();
        grandfather2.name = "grandfather2";
        grandfather2.age = 54;
        grandfather2.sex = true;
        grandfather2.children.add(mother);

        Human grandmother2 = new Human();
        grandmother2.name = "grandmother2";
        grandmother2.age = 54;
        grandmother2.sex = false;
        grandmother2.children.add(mother);

        list.add(children1);
        list.add(children2);
        list.add(children3);
        list.add(father);
        list.add(mother);
        list.add(grandfather1);
        list.add(grandfather2);
        list.add(grandmother1);
        list.add(grandmother2);

        for (Human hum: list) {
            System.out.println(hum);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
