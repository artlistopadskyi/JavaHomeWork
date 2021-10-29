package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку ");
        String stringMain;
        stringMain = scanner.nextLine();

        System.out.println("Введите вторую строку ");
        String stringCheck;
        stringCheck = scanner.nextLine();

        String message = "Слова не анаграммы";
        if (anagramLines(stringMain, stringCheck)) {
            message = "Слова анаграммы";
        }

        System.out.println(message);
    }

    static Boolean anagramLines(String stringMain, String stringCheck) {
        char[] lineMain = clearString(stringMain.toUpperCase()).toCharArray();
        char[] lineCheck = clearString(stringCheck.toUpperCase()).toCharArray();

        Arrays.sort(lineMain);
        Arrays.sort(lineCheck);

        return Arrays.equals(lineMain, lineCheck);
    }

    static String clearString(String string) {
        return string.replaceAll("[^a-zA-Zа-яёА-ЯЁ\\d]", "");
    }
}
