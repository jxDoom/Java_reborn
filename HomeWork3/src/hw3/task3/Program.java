package hw3.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}

class Answer{
    public static void analyzeNumbers(Integer[] arr){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        quickSort(arr, 0, arr.length - 1);
        arrayList.addAll(Arrays.asList(arr));
        System.out.println(arrayList.toString());
        System.out.printf("Minimum is %d\n", arr[0]);
        System.out.printf("Maximum is %d\n", arr[arr.length - 1]);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arrayList.get(i);
        System.out.printf("Average is = %d\n", sum/arrayList.size());
    }
    public static void quickSort(Integer[] arr, int low, int high){
        //завершить,если массив пуст или уже нечего делить
        if (arr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low)/2;
        int border = arr[middle];

        //разделяем на подмассивы и меняем местами
        int i = low; int j = high;
        while (i <= j){
            while (arr[i] < border) i++;
            while (arr[j] > border) j--;
            if (i <= j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }
}