package seminar2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");

            int i;
            while ((i = fis.read()) != -1) {
// Читаем и выводим содержимое файла по одному байту
                System.out.print((char) i);
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
//        oos.writeObject(myObject);
//        oos.close();
    }
}