package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
В статическом блоке инициализировать labels 5 различными парами ключ-значение.


Требования:
1. В классе Solution должен быть только один метод (main).
2. В классе Solution должно быть объявлено статическое поле labels типа Map.
3. Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4. Метод main должен выводить содержимое labels на экран.-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        for (int i = 0; i < 5; i++) {
            labels.put(3.14 * i, "Pi" + i);
        }
    }


    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            labels.put(3.14 * i, "Pi");
//        }


//        labels.put(3.14, "Pi_1");
//        labels.put(3.1415, "Pi_2");
//        labels.put(3.141592, "Pi_3");
//        labels.put(3.14159265, "Pi_4");
//        labels.put(3.1415926535, "Pi_5");

        System.out.println(labels);
    }
}
