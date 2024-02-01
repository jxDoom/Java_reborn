package hw6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String[] names = new String[]{
                "Кирилл", "Геннадий", "Геннадий", "Александр", "Алексей", "Руслан", "Алексей",
                "Денис", "Светлана", "Ирина", "Ирина", "Александр", "Ольга", "Артур", "Алексей"};
        Integer[] numbers = new Integer[]{
                111, 222, 333, 444, 555, 666, 777, 888,
                999, 123, 456, 789, 987, 654, 321};

        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>() {
// Переопределяем метод toString для красивого вывода
            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                forEach((key, value) -> sb.append(String.format("%10s ",key)).append(" ").append(value).append("\n"));
                return sb.toString();
            }
        };

// Заполняем с учетом разных номеров у человека
        for (int i = 0; i < names.length; i++) {
            ArrayList<Integer> tmp = new ArrayList<>(1);
            if (phoneBook.containsKey(names[i])) {
                phoneBook.get(names[i]).add(numbers[i]);
            }else{
                tmp.add(numbers[i]);
                phoneBook.put(names[i],tmp);
            }
        }
//        System.out.println(phoneBook);

// Сортируем по значению и выводим в потоке
        phoneBook.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.size() - o1.size()))
                .forEach(System.out::println);
    }
}
