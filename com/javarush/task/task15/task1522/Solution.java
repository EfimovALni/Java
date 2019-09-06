package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Из за орфографической ошибки....

Задача успешно прошла тестирование!
Вы решили задачу лучше, чем 1% учеников. Вам удалось ее решить с 15 попытки.
Среднее количество попыток для этой задачи 3.12. Всего эту задачу решили 18242 учеников.
Закрепляем паттерн Singleton
*/

public class Solution {
    public static String EMPTY = "";

    public static void main(String[] args) {
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }


    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        try {
// while (!(line = br.readLine()).equals(EMPTY)) {

            {
                line = br.readLine();
                if (line.equals(Planet.SUN)) {
                    thePlanet = Sun.getInstance();
//                    System.out.println("Sun + \t" + thePlanet);
                } else if (line.equals(Planet.MOON)) {
                    thePlanet = Moon.getInstance();
//                    System.out.println("Moon + \t" + thePlanet);
                } else if (line.equals(Planet.EARTH)) {
                    thePlanet = Earth.getInstance();
//                    System.out.println("Esrth + \t" + thePlanet);
                } else
                    thePlanet = null;
            }
//        }
        br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
