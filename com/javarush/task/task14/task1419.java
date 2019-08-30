package com.javarush.task.task14.task1419;

import javax.management.ObjectName;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.RemoteException;
import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений

Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) { exceptions.add(e); }

        //напишите тут ваш код

        //  java.lang.ArrayIndexOutOfBoundsException: 3
        try {
            int[] arr = {1,2,3};
            for (int i = 0; i < arr.length  + 1; i++) {
                arr[i] = arr[i];
            }
        } catch (Exception e) {exceptions.add(e);}

        //  java.io.FileNotFoundException: D:\000.txt (Не удается найти указанный файл)
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\000.txt"));
        } catch (Exception e) {exceptions.add(e);}

        //  java.lang.NumberFormatException: null
        try {
            Integer.parseInt(null);

        } catch (Exception e){exceptions.add(e);}

        //  java.lang.NullPointerException
        try {
            Double.parseDouble(null);
        } catch (Exception e) {exceptions.add(e);}

        //  java.lang.IllegalArgumentException: a must not be null
        //  возникает в результате некорректного состояния объекта. Например, использование объекта перед тем как он будет инициализирован.
        try {
            Object a = null;
            if (a == null) {
                throw new IllegalArgumentException("a must not be null");
            }
        } catch (Exception e) {exceptions.add(e);}
            
        //  java.io.IOException: Stream closed
        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.close();
            fileWriter.write("hello");
        } catch (Exception e) {exceptions.add(e);}

        //  java.lang.ArrayStoreException: java.lang.Character
        //  Если попытаться записать в ячейку массива ссылку на объект неправильного типа, возникнет исключение ArrayStoreException.
        try {
            Object obj[] = new String[5];
            obj[0] = new Character('*');

        } catch (Exception e) {exceptions.add(e);}

        //  java.lang.ClassCastException: java.base/java.lang.Character cannot be cast to java.base/java.lang.Byte
        //  В языке программирования Java вы не можете выполнять явное преобразование типов произвольным образом. Если выполнить такое преобразование для классов, не связанных "узами" наследования, или другим недопустимым способом,  возникнет исключение ClassCastException.
        try {
            Object object = new Character('*');
            System.out.println((Byte) object);

        } catch (Exception e) {exceptions.add(e);}

        //  java.lang.NegativeArraySizeException
        try {
            int[] arr = new int[-3];

        } catch (Exception e) {exceptions.add(e);}


    }
}
