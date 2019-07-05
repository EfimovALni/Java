import javafx.scene.control.Cell;

import java.io.*;

/**
 *******   Наследование    *******
 *
 * В программировании наследование заключается в использовании уже существующих классов для описания новых.
 *
 * Рассмотрим пример создания класса смартфон с помощью наследования. Все беспроводные телефоны работают от 
 * аккумуляторных батарей, которые имеют определенный ресурс работы в часах. Поэтому добавим это свойство в 
 * класс беспроводных телефонов:
 *
 *  */
public class Oop_ {
    public static void main(String[] args) throws IOException {

        CellPhone cellPhone = new CellPhone(2009, 21);
        cellPhone.call(900);
        cellPhone.ring(100);
        
        
    }

    public static class WirelessPhone extends AbstractPhone {
        private int hour;

        public WirelessPhone(int year, int hour) {
            super(year);
            this.hour = hour;
        }
    }

    public static class AbstractPhone {

        public AbstractPhone(int year) {

        }
    }

    public static class CellPhone extends WirelessPhone {
        public CellPhone (int year, int hour) {
            super(year, hour);
        }


        public void call (int outputNumber) {
            System.out.println("Colling number... " + outputNumber);
        }

        public void ring (int intinputNumber) {
            System.out.println("Incoming ring.... " + intinputNumber );
        }
    }


    public class Smartphone extends CellPhone {
        private String operationSystem;

        public Smartphone (int year, int hour, String operationSystem) {
            super(year, hour);
            this.operationSystem = operationSystem;
        }

        public void install(String programm) {
            System.out.println("Installing " + programm + " for " + operationSystem);
        }
    }
}
