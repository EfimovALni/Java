package com.javarush.task.task14.task1412;
// https://javarush.ru/tasks/com.javarush.task.task14.task1412

/* 
Реализовать метод printMainInfo
*/

public class Solution {
    public static void main(String[] args) {

        /*Citata
        Смысл, как я его понял: в метод приходит объект типа Drawable или Movable.
        Но приходит он в переменной типа Object. В типе Object нет методов draw или move и просто так вызвать эти методы нельзя.
        Поэтому после определения типа объекта в переменной object, расширяем переменную типа Object до переменной типа Drawable или Movable.
          */

        Object obj = new Circle();
//        ((Circle) obj).move();

        Movable movable = (Movable) obj;
//        ((Circle) obj).move();

        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        //напишите тут ваш код
        if (object instanceof Drawable) {
            ((Drawable) object).draw();
        } else if (object instanceof Movable) {
            ((Movable) object).move();
        }
    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Can be drawn");
        }

        public void move() {
            System.out.println("Can be moved");
        }
    }
}
