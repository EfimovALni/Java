import javafx.scene.control.Cell;

import java.io.*;

/**
 *******   Полиморфизм    *******
 *Если мы посмотрим на все модели телефонов, то, несмотря на различия во внешнем облике и устройстве моделей, мы можем
 * выделить у них некое общее поведение – все они могут принимать и совершать звонки и имеют достаточно понятный и
 * простой набор кнопок управления. Применяя известный нам уже один из основных принципов ООП абстракцию в терминах
 * программирования можно сказать, что объект телефон имеет один общий интерфейс. Поэтому пользователи телефонов могут
 * вполне комфортно пользоваться различными моделями, используя одни и те же кнопки управления (механические или сенсорные),
 * не вдаваясь в технические тонкости устройства.
 * Так, вы постоянно пользуетесь сотовым телефоном, и без труда сможете совершить звонок с его стационарного собрата.
 *
 * Принцип в ООП, когда программа может использовать объекты с одинаковым интерфейсом без информации о
 * внутреннем устройстве объекта, называется полиморфизмом.
 *
 *  */
public class Oop_ {
    public static void main(String[] args) throws IOException {

        AbstractPhone firstPhone = new TomasEdissonPhone(1876);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);

        User user = new User("Семён");
        user.callAnatherUser(900, firstPhone);
        user.callAnatherUser(300, phone);
        user.callAnatherUser(100, videoPhone);


//        TomasEdissonPhone tomasEdissonPhone = new TomasEdissonPhone(1867);

    }

    public static class User {
        private String name;

        public User(String namae) {
            this.name = namae;
        }

        public void callAnatherUser(int number, AbstractPhone phone) {
            phone.call(number);
        }


    }

    public static abstract class AbstractPhone {
        private int year;

        public AbstractPhone(int year) {
            this.year = year;
        }

        public abstract void call(int outputNumber);
        public abstract void  ring(int inputname);
    }

    public static class TomasEdissonPhone extends AbstractPhone {

        public TomasEdissonPhone(int year) {
            super(year);
        }
        @Override
        public void call(int outputNumber) {
            System.out.println("Вращайте ручку");
        }

        @Override
        public void ring(int inputname) {
            System.out.println("Сообщите номер абонента, сэр");
        }
    }

    public static class Phone extends AbstractPhone {
        public Phone(int year) {
            super(year);
        }

        @Override
        public void call(int outputNumber) {
            System.out.println("Вызываю номер " + outputNumber);
        }

        @Override
        public void ring(int inputname) {
            System.out.println("Телефон звонит");
        }
    }


    public static class VideoPhone extends AbstractPhone {
        public VideoPhone(int year) {
            super(year);
        }

        @Override
        public void call(int outputNumber) {
            System.out.println("Подключаю видеоканал для абонента " + outputNumber);
        }

        @Override
        public void ring(int inputname) {
            System.out.println("У вас входящий видеовызов... " + inputname);
        }
    }
}

