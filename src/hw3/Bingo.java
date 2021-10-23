package hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 1 до 100");
        System.out.println("Для вихода из программы введите - сдаюсь.");

        Random random = new Random();

        final int MAX_ATTEMPT = 101;
        int x = random.nextInt(101);
        int attempt = 0;
        Scanner in = new Scanner(System.in);


        while (attempt < MAX_ATTEMPT) {
            attempt++;
            String value = in.next();

            if (value.equals("сдаюсь")) {
                break;
            } else {

                int num = Integer.parseInt(value);
                if (x == num) {
                    System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                    break;
                } else {
                    System.out.println("Неверно,попробуйте еще.");

                }

            }
        }
        System.out.println("Конец игры!");
    }
}





