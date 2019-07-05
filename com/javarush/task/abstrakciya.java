import java.io.*;

/**
 *******   Абстракция    *******
 * Теперь с помощью абстракции мы можем выделить в этой иерархии объектов общую информацию: общий абстрактный
 * тип объектов — телефон, общую характеристику телефона — год его создания, и общий интерфейс — все телефоны
 * способны принимать и посылать вызовы.
 *  */
public class Oop_ {
    public static void main(String[] args) throws IOException {

        AbstractPhone abstractPhone = new AbstractPhone(1923) {
            @Override
            public void call(int outputNumber) {
                System.out.println("Call");
            }

            @Override
            public void ring(int inputNumber) {
                System.out.println("Ring");
            }
        };

        abstractPhone.call(1002222);
        abstractPhone.ring(8414777);

        }
    public abstract static class AbstractPhone {
        private int year;

        public AbstractPhone(int year) {
            this.year = year;
        }

        public abstract void call (int outputNumber);
        public abstract void ring (int inputNumber);
    }
}
