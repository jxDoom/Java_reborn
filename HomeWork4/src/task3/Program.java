package task3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Random random = new Random();
        int a = random.nextInt(0, 20);
        System.out.println(a);
        int b = random.nextInt(1, 10);
        System.out.println(b);
        char op1 = '+';
        char op2 = '*';
        char op3 = '<';
        double res1 = calculator.calculate(op1, a, b);
        System.out.println(res1);
        double res2 = calculator.calculate(op2, a, b);
        System.out.println(res2);
        double res3 = calculator.calculate(op3, a, b);
        System.out.println(res3);
    }
}

class Calculator{
    Deque<Double> deque = new ArrayDeque<>();
    public double calculate(char op, int a, int b){
        switch (op){
            case '+':
                deque.push((double) a + b);
                return (double) a + b;
            case '-':
                deque.push((double) a - b);
                return (double) a - b;
            case '*':
                deque.push((double) a * b);
                return (double) a * b;
            case '/':
                deque.push((double) a / b);
                return (double) a / b;
            default:
                double tmp = deque.removeLast();
                return tmp;

        }
    }
}
