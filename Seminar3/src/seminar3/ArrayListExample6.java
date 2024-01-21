package seminar3;

import java.util.ArrayList;

public class ArrayListExample6 {
    public static void main(String[] args) {
// Создаем ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> fruits2 = new ArrayList<>();
        ArrayList<ArrayList<String>> fruit = new ArrayList<>();
// Добавляем элементы в список
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        fruits2.add("Яблоко");
        fruits2.add("Банан");
        fruits2.add("Апельсин");

// Получаем строковое представление списка
        String fruitsString = fruits.toString();
        String fruitsString2 = fruits2.toString();

// Выводим строковое представление
        System.out.println("Строковое представление списка: " + fruitsString + fruitsString2);

        fruit.add(fruits);
        fruit.add(fruits2);
        System.out.println(fruit);
    }
}
