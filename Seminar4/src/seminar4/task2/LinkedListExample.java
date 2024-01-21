package seminar4.task2;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Добавляем элементы в начало списка
        linkedList.addFirst("Первый");
        linkedList.addFirst("Второй");
        linkedList.addLast("Самый последний");

        System.out.println("Список после добавления в начало: " + linkedList);

        // Получаем первый элемент списка
        String firstElement = linkedList.getFirst();

        System.out.println("Первый элемент списка: " + firstElement);

        // Получаем последний элемент списка
        String lastElement = linkedList.getLast();

        System.out.println("Последний элемент списка: " + lastElement);
    }
}