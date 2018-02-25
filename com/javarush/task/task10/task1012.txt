package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв

Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
//        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        int[] abcCount = new int[abc.length()];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                for (int k = 0; k < alphabet.size(); k++) {
                    if (list.get(i).charAt(j) == alphabet.get(k)) {
                        abcCount[k] += 1;
                    } else {
                    }
                }
            }
        }

        for (int i = 0; i < abcArray.length; i++) {
            for (int j = 0; j < abcCount.length; j++) {
                System.out.println(abcArray[j] + " " + abcCount[j]);
            }
            break;
            
        }
    }
}


/*Задача успешно прошла тестирование!  Вы решили задачу лучше, чем 34% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 1.7. Всего эту задачу решили 21087 учеников.*/
