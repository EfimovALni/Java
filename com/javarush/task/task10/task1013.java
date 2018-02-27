package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human

Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name, sername;
        private boolean sex;
        private int age;
        private double weight, salary;

        public Human(int age, boolean sex) {
            this.age = 497;
            this.sex = true;
        }

        public Human(String name) {
            this.name = "Mask";
        }

        public Human(String name, String sername) {
            this.name = "Mask";
            this.sername = "Ilon";
        }

        public Human (String name, String sername, boolean sex) {
        this.name = "Mask";
        this.sername = "Ilon";
        this.sex = true;
        }

        public Human (String name, String sername, boolean sex, int age) {
            this.name = "Mask";
            this.sername = "Ilon";
            this.sex = false;
            this.age = 98;
        }

        public Human (String name, String sername, int age, boolean sex, double weight) {
            this.name = "Mask";
            this.sername = "Ilon";
            this.sex = false;
            this.age = 98;
            this.weight = 84.44;
        }

        public Human (String name, String sername, boolean sex, int age, double weight) {
            this.name = "Mask";
            this.sername = "Ilon";
            this.sex = false;
            this.age = 98;
            this.weight = 84.44;
        }

        public Human (String name, int age) {
            this.name = "Mask";
            this.age = 54;
        }

        public Human (String sername, boolean sex) {
            this.name = "Ilon";
            this.sex = false;
        }

        public Human (String name, double weight) {
            this.name = "Mask";
            this.weight = 54.02;
        }
    }
}
