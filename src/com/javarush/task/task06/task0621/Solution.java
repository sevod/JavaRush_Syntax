package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);


        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;
        private Cat grandFather;
        private Cat grandMother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat grandFather, Cat grandMother) {
            this.name = name;
            this.grandFather = grandFather;
            this.grandMother = grandMother;
        }

        Cat(String name, Cat father, Cat mother, Cat grandFather, Cat grandMother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (mother == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name;
        }
    }

}
