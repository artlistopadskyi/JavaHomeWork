package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Введите масив");
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сума массива:" + (sum));
    
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            count++;
        }
    }
        System.out.println("В массиве " + Arrays.toString(arr));
        System.out.println(count + " положительных элементов");

    }
}



