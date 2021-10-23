package hw3;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        int x = array.length;

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int myArray[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Сума массива:" + (sum));

        int[] arr = {2,4,6,8,10,12,14,16,18};
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



