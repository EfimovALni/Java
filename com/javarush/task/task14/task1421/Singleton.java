package com.javarush.task.task14.task1421;
//https://javarush.ru/groups/posts/589-patternih-i-singleton--dlja-vsekh-kto-vpervihe-s-nimi-stolknulsja

public class Singleton {

    // Step 1
    // – Нужно добавить в класс приватное статическое поле, содержащее одиночный объект:
    private static Singleton instance;  //  #1

    // Step 2
    // Сделать конструктор класса (конструктор по-умолчанию) приватным (чтобы доступ к нему был закрыть за пределами класса, тогда он не сможет возвращать новые объекты):
    private Singleton(){}   //  #2

    // Step 3
    // – Объявить статический создающий метод, который будет использоваться для получения одиночки:

    public static Singleton getInstance() { //  #3
        if (instance == null) {             // если объект еще не создан
            instance = new Singleton();     //создать новый объект
        }
        return instance;                    // вернуть ранее созданный объект
    }


}
