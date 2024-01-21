package seminar4.task6;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Создаем приоритетную очередь с элементами типа Integer
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Добавляем элементы с учетом их приоритета
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(1);

        // Извлекаем элементы с наивысшим приоритетом
        // Выводим приоритетную очередь до извлечения элементов
        System.out.println("Приоритетная очередь: " + priorityQueue);

        // Извлекаем элемент с наивысшим приоритетом без удаления
        int highestPriority = priorityQueue.peek();
        System.out.println("Наивысший приоритет (без удаления): " + highestPriority);

        // Извлекаем и удаляем элемент с наивысшим приоритетом
        int removedHighestPriority = priorityQueue.poll();
        System.out.println("Наивысший приоритет (после удаления): " + removedHighestPriority);

        // Выводим приоритетную очередь после извлечения элемента
        System.out.println("Приоритетная очередь после извлечения: " + priorityQueue);
    }
}
