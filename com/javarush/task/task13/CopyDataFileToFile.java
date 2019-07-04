import java.io.*;

/**
 Для того, чтобы прочитать данные из файла на диске, есть специальный класс FileInputStream, который реализует интерфейс
 InputStream. Хочешь записать прочитанные данные в другой файл? Для этого есть класс FileOutputStream, который реализует
 интерфейс OutputStream. Вот как выглядит код копирования [данных одного] файла в другой.
 * */
public class Oop_ {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("D:/Source.txt");
        OutputStream outputStream = new FileOutputStream("D:/Result.txt");

        while (inputStream.available() > 0 ) {
            int data = inputStream.read(); //читаем один байт из потока для чтения
            outputStream.write(data); //записываем прочитанный байт в другой поток.
        }

        inputStream.close();  //закрываем потоки
        outputStream.close();
    }
}
