package com.javarush.task.task10.task1014;

/* 
Расставьте минимум static-ов
Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.

Требования:
1. В классе должна быть переменная A.
2. В классе должна быть переменная B.
3. В классе должна быть переменная C.
4. В классе должна быть переменная D.
5. Метод main не изменять.
6. Метод getA не изменять.
*/

public class Solution {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }
}

/*Вы решили задачу лучше, чем 7% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 1.11. Всего эту задачу решили 22831 учеников.*/
