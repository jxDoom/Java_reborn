package task2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 8, 3, 1};

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

//        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

class BubbleSort{
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] arr) {
        try {
            // Очистка файла log перед началом сортировки
            log = new File("log.txt");
            if (log.exists()) log.delete();

            fileWriter = new FileWriter(log, true); // true для дозаписи в файл

            // Логирование времени
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
            boolean swapped; // флаг для проверки перестановок

            for (int i = 0; i < arr.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                        swapped = true;
                    }
                }
                if (swapped) {
                    fileWriter.write(timeStamp + " " + buildArrayLine(arr) + "\n");
                }
            }
            fileWriter.write(timeStamp + " " + buildArrayLine(arr) + "\n");

            fileWriter.close(); // Закрытие FileWriter после записи в файл
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String buildArrayLine(int[] arr){
        // Вывод массива в терминал
        StringBuilder masBuilder = new StringBuilder();

        // Формируем правую часть строки для лога файла
        masBuilder.append("[");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                masBuilder.append(arr[i]);
            }else {
                masBuilder.append(arr[i] + ", ");
            }
        }masBuilder.append("]");
        return masBuilder.toString();
    }
}