package TreeMap;

import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> ageMap = new TreeMap<>();
        ageMap.put("Анна", 25);
        ageMap.put("Иван", 30);
        ageMap.put("Мария", 28);
        ageMap.put("Олег", 26);

// Получаем наибольший ключ, меньший или равный "Константин"
        String floorKey = ageMap.floorKey("Константин"); // вернет ключ сравнивая его с другими ключами по алфавитному порядку
        System.out.println("Наибольший ключ, меньший или равный 'Константин': " + floorKey);

// Получаем Наименьший ключ, больший или равный "Константин"
        String ceilingKey = ageMap.ceilingKey("Константин"); // вернет ключ сравнивая его с другими ключами по алфавитному порядку
        System.out.println("Наименьший ключ, больший или равный 'Константин': " + ceilingKey);

// Получаем наименьший ключ, строго больший "Мария"
        String higherKey = ageMap.higherKey("Мария");
        System.out.println("Наименьший ключ, строго больший 'Мария': " + higherKey);

// Получаем наибольший ключ, строго меньший "Мария"
        String lowerKey = ageMap.lowerKey("Мария");
        System.out.println("Наибольший ключ, строго меньший 'Мария': " + lowerKey);
    }
}

