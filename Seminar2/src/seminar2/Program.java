package seminar2;

public class Program {
    public static void main(String[] args) {
// Создаем строку
        String greeting = "Hello, World!";

// Конкатенация строк
//        String name = "Java";
//        String message = greeting + " Welcome to " + name + "!";

// Выводим исходную и новую строки
//        System.out.println("Original string: " + greeting);
//        System.out.println("Concatenated string: " + message);

// Демонстрация неизменяемости строк
        greeting = greeting.toUpperCase();
        System.out.println("Modified string: " + greeting);
        System.out.println("Original string still same: " + greeting);

//        String s1 = "Hello"; // Создание строки литералом
//        String s2 = new String("World"); // Создание строки с помощью конструктора

//        String str1 = "Hello"; // str1 = s1 (ссылки одинаковые)
// Заметка: Пул строк является фундаментальным/общим уровнем.

//        String[] seasons = new String[] {"Winter", "Spring", "Summer", "Autumn", "Hello"};

//        String s = "Hello";
//        int length = s.length(); // Возвращает длину строки

//        String s1 = "Hello";
//        String s2 = "hello";
//        boolean isEqual = s1.equals(s2); // false, потому что регистр символов различается
//        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2); // true, сравнение без учета регистра

// Поиск в строке
//        String s = "Hello, World!";
//        int index = s.indexOf('W'); // Возвращает индекс первого вхождения символа 'W'

// Срезы
//        String s = "Hello, World!";
//        String sub = s.substring(7, 12); // Возвращает подстроку "World"

// Замена в строке
//        String s = "Hello, World!";
//        String replaced = s.replace("World", "Java"); // Заменяет "World" на "Java"

// Преобразование регистра
//        String s = "Hello, World!";
//        String lower = s.toLowerCase(); // Преобразует все символы в нижний регистр
//        String upper = s.toUpperCase(); // Преобразует все символы в верхний регистр

// Метод, который удаляет начальные и конечные пробелы
//        String s = " Hello, World! ";
//        String trimmed = s.trim(); // Удаляет начальные и конечные пробелы

// Соединение строк
        String s1 = "Hello";
        String s2 = "World";
        String combined = s1 + " " + s2; // Соединение строк с помощью оператора +

        String name = "Java";
        int version = 9;
        String formatted = String.format("Language: %s, Version: %d", name, version); // Форматирование строки

// Проверка строки на пустоту
        String s = "";
        boolean isEmpty = s.isEmpty(); // Проверка, является ли строка пустой
    }
}
