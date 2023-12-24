package task2;

import static java.lang.Math.sqrt;

public class Program {
    public static void main(String[] args) {
        simpleNums();
    }

    public static void simpleNums() {
        //Так как все четные числа кроме 2 уже не будут простыми, сделаем поиск простых чисел среди нечетных
        System.out.println(2);
        int n = 3;
        while (n < 1000) {
            boolean flag = false;
            for (int i = 2; i <= sqrt(n); i++) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(n);
            }
            n += 2;
        }
    }
}
