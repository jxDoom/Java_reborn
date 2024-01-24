package task1;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        LinkedList<Object> llRevert = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        for (int i = ll.toArray().length; i > 0; i--)
            llRevert.add(ll.pollLast());
        System.out.println(llRevert);
    }
}
