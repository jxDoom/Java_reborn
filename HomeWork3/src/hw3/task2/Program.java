package hw3.task2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Integer[] arr = new Integer[]{2, 4, 6, 8};

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int item = 0; item < arr.length; item++){
            if (arr[item] % 2 != 0) arrayList.add(arr[item]);
        }
        System.out.println(arrayList);
    }
}
