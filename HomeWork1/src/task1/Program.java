package task1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("-1");
        } else {
            System.out.println(countNTriangle(num));
        }
    }

    public static int countNTriangle(int num) {
        return num * (num + 1) / 2;
    }
}
