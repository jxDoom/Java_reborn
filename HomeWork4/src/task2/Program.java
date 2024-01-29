package task2;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {


    }
}

class MyQueue<T>{
    LinkedList<T> list = new LinkedList<>();
    public void enqueue(T element){
        list.addLast(element);
    }
    public T dequeue(){
        return list.pollFirst();
    }
    public T first(){
//        return list.getFirst();
        return list.peekFirst();
    }
    public LinkedList<T> getElements(){
        
    }
}