package com.javarush.task.task14.task1420;
// https://younglinux.info/algorithm/euclidean

/* 
НОД
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.


Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        if (a <= 0) throw  new Exception();
        b = sc.nextInt();
        if (b <= 0) throw  new Exception();

            while (a != b) {
                if (a > b) {
                    a = a -b;
                } else {
                    b = b - a;
                }
        }
        System.out.println(a);


    }
}
