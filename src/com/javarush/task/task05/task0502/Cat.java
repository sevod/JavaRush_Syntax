package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int points = 0;
        if (this.age > anotherCat.age)
            points++;
        else if (this.age < anotherCat.age)
            points--;
        if (this.weight > anotherCat.weight)
            points++;
        else if (this.weight < anotherCat.weight)
            points--;
        if (this.strength > anotherCat.strength)
            points++;
        else if (this.strength < anotherCat.strength)
            points--;

        if (points > 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
