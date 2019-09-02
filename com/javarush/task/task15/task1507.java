package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.


Требования:
1. В классе Solution должны быть реализованы 10 методов printMatrix с различными аргументами.
2. Класс Solution должен быть public.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
//        printMatrix(2.0, 3, "8");
//        printMatrix(2, 3.0, "8");
//        printMatrix(2.0, 3.0, "8");
//        printMatrix("8", 2, 3);
//        printMatrix( 2,"8", 3);
//        printMatrix( 2.0,"8", 3);
//        printMatrix( 2,"8", 3.0);
//        printMatrix( "8", 2.0, 3);
//        printMatrix( "8", 2, 3.0);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Double m, Object value) {}
    public static void printMatrix(int m, Object value) {}
    public static void printMatrix(Double m, Double n, int e, Object value) {}
    public static void printMatrix(Object value, int m, int n, int r) {}
    public static void printMatrix( Double m, Object value, int n, Object re) {}
    public static void printMatrix( int m, Object l, Object value, int n) {}
    public static void printMatrix(int[][] r, int[][] e, Object f) {}
    public static void printMatrix(Double k, Object e, Object l, Double pl) {}
}
