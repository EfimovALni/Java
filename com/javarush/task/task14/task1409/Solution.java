package com.javarush.task.task14.task1409;

/* 
Мосты

1. Создать интерфейс Bridge с методом int getCarsCount().

2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.

3. Метод getCarsCount() должен возвращать любое фиксированное значение типа int.

4. Метод getCarsCount() должен возвращать различные значения для различных классов.

5. В классе Solution создать публичный метод println(Bridge bridge).

6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.

7. Каждый класс и интерфейс должны быть в отдельных файлах.





Требования:

1. Интерфейс Bridge должен быть создан в отдельном файле.

2. Классы WaterBridge и SuspensionBridge должны быть созданы в отдельных файлах.

3. Классы WaterBridge и SuspensionBridge должны реализовывать интерфейс Bridge.

4. Метод getCarsCount() должен возвращать различные значения типа int для различных классов, но всегда фиксированное(константное) значение для разных объектов одного и того же класса.

5. В классе Solution должен быть реализован публичный(public) метод println c одним параметром типа Bridge.

6. Метод println должен выводить на консоль количество машин(результат работы метода getCarsCount) для переданного ему моста(объекта типа Bridge).

7. В интерфейсе Bridge должен быть определен метод int getCarsCount().
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }

}

