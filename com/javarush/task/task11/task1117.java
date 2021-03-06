package com.javarush.task.task11.task1117;

/* 
Альтернативная цепочка наследования

Расставь правильно "цепочку наследования" в классах: Carnivore (плотоядное животное), Cow (корова), Dog (собака), Pig (свинья), Animal (животное).


Требования:
1. В классе Solution должен быть public класс Carnivore (плотоядное животное).
2. В классе Solution должен быть public класс Cow (корова).
3. В классе Solution должен быть public класс Dog (собака).
4. В классе Solution должен быть public класс Pig (свинья).
5. В классе Solution должен быть public класс Animal (животное).
6. Класс Carnivore должен быть унаследован от класса Animal.
7. Класс Cow должен быть унаследован от класса Animal.
8. Класс Dog должен быть унаследован от класса Carnivore.
9. Класс Pig должен быть унаследован от класса Animal.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Carnivore extends Animal {

    }

    public class Cow extends Animal {

    }

    public class Dog extends Carnivore {

    }

    public class Pig extends Animal {

    }

    public class Animal {

    }
}
