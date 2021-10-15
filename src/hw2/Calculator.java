package hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите первое число");
        x = scan.nextInt();
        int y;
        System.out.println("Введите второе  число");
        y = scan.nextInt();
        String sign;
        System.out.println("выбирите действия +,-,/,*");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                if (y == 0) {
                    System.out.println("на ноль не делить");
                } else {
                    System.out.println(x / y);
                }
                break;
        }

        }

    }

