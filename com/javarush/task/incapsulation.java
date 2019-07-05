import java.io.*;

/**
https://javarush.ru/groups/posts/principy-oop
 *******   Инкапсуляция    *******
 * Инкапсуляция и управление доступом
 * Допустим, при производстве на тыльной стороне телефона гравируется информация о нем: год его выпуска или логотип 
 * компании производителя. Эта информация вполне конкретно характеризует данную модель — его состояние. Можно сказать, 
 * разработчик телефона позаботился о неизменности этой информации — вряд ли кому-то придет в голову удалять гравировку. 
 *
 * В мире Java состояние будущих объектов описывается в классе с помощью полей, а их поведение – с помощью методов. 
 * Возможность же изменения состояния и поведения осуществляется с помощью модификаторов доступа к полям и методам – private, 
 * protected, public, а также default (доступ по умолчанию). 
 *
 * Например, мы решили, что год создания, название производителя телефона и один из методов относятся к внутренней 
 * реализации класса и не подлежат изменению другими объектами в программе.
 *  */
public class Oop_ {
    public static void main(String[] args) throws IOException {
        SomePhone somePhone = new SomePhone(2010, "SUMSUNG");

        somePhone.call();
        somePhone.ring();
        }


        public static class SomePhone {
        private int year;
        private String company;

        public SomePhone (int year, String company) {
            this.year = year;
            this.company = company;
        }
        private void openConnection() {
            // find comutator
            // openNewConnection
        }

        public void call() {
            openConnection();
            System.out.println("Colling bumber");
        }

        public void ring() {
            System.out.println("Ringggg-Ring...");

        }        }
}
