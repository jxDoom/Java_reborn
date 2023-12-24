package task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner num1 = new Scanner(System.in);
        int num1Value = num1.nextInt();
        System.out.print("Введите действие: ");
        Scanner operation = new Scanner(System.in);
        char op = operation.next().charAt(0);
        System.out.print("Введите второе число: ");
        Scanner num2 = new Scanner(System.in);
        int num2Value = num2.nextInt();
        System.out.print("Результат = " + calculate(op, num1Value, num2Value));
    }

    public static int calculate(char op, int a, int b) {
        int res = 0;
        if (op == '+') {
            res = a + b;
        } else if (op == '-') {
            res = a - b;
        } else if (op == '*') {
            res = a * b;
        } else if (op == '/') {
            res = a / b;
        } else {
            System.out.println("Некорректный оператор: " + op);
            res = -1;
        }
        return res;
    }
}
