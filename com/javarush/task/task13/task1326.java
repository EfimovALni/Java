package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла

1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10

Требования:
•	Программа должна считывать данные с консоли.
•	Программа должна создавать FileInputStream для введенной с консоли строки.
•	Программа должна выводить данные на экран.
•	Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
•	Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader brFilePath = new BufferedReader(inputStreamReader);

//        String filePath = "D:\\Test.txt";
        List<Integer> list= new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(brFilePath.readLine()), StandardCharsets.UTF_8));) {
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                if ((Integer.parseInt(line) % 2) == 0) {
                    list.add(Integer.parseInt(line));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println(list);
        list.sort(Comparator.naturalOrder());
//        System.out.println(list);

        list.forEach(System.out::println);
    }
}
