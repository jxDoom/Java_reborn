package seminar2;

import java.io.File; //представляет собой абстракцию. Этот класс не содержит методов для чтения и записи данных файла,
//но он используется для получения информации о файле или для его создания или удаления
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
// Создаем объект файла
            File file = new File("example.txt");

// Проверяем, существует ли файл
            if (!file.exists()) {
// Создаем новый файл, если он не существует
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

// Получаем и выводим путь к файлу
            System.out.println("File path: " + file.getAbsolutePath());

// Удаляем файл
// file.delete();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
