package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
    }
    
    static {
        //add your code here - добавьте код тут
        try {
            Solution.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int pass;

        str = bufferedReader.readLine();

        if (str.equals("helicopter")) {
            result = new Helicopter();

        } else if (str.equals("plane")) {
            int k  =  Integer.parseInt(String.valueOf((bufferedReader.read())));
            result = new Plane(k);
        }
        bufferedReader.close();

    }
}
