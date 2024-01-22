package hw3.task1;

/*import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 6, 2, 3, 4};

        MergeSort ans = new MergeSort();
        System.out.println(Arrays.toString(ans.mergeSort(arr)));
    }
}

class MergeSort{
    public static int[] mergeSorted(int[] buffer1, int[] buffer2, int startIndex, int endIndex){
        if (startIndex >= endIndex - 1) return buffer1;

// Уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] left = mergeSorted(buffer1, buffer2, startIndex, middle);
        int[] right = mergeSorted(buffer1, buffer2, middle, endIndex);

// Слияние
        int index1 = startIndex;
        int index2 = middle;
        int floatIndex = startIndex;
        int[] res = left == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex){
            res[floatIndex++] = left[index1] < right[index2] ? left[index1++] : right[index2++];
        }while (index1 < middle) res[floatIndex++] = left[index1++];
        while (index2 < endIndex) res[floatIndex++] = right[index2++];
        return res;
    }
    public static int[] mergeSort(int[] arr){
        int[] buffer1 = Arrays.copyOf(arr, arr.length);
        int[] buffer2 = new int[arr.length];
        return mergeSorted(buffer1, buffer2, 0, arr.length);
    }
}*/

//-----------------------------------------------------------------------------------------------

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int n = a.length;
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {

        int left = l.length;
        int right = r.length;
        int[] a = new int[left + right];
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return a;
    }
}

public class Program{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
