package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(5, 0.75f, true) {
            @Override // Переопределение метода remove, el
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) { // метод позволяет переопределять условия для удаления старых записей из LinkedHashMap
                return size() > 5; // очистка кеша при превышении числа 5
            }
        };

// Добавляем элементы в кеш
        for (int i = 0; i < 10; i++) {
            cache.put("Key" + i, i);
        }

// После добавления 10 элементов, останутся только последние 5, так как старые автоматически удаляются
        System.out.println(cache);
    }
}
