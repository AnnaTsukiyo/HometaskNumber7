package Package2;

import java.util.Scanner;

public class ArraysTask2 {
    public static void main(String[] args) {
        int anyNumber = 0;
        boolean isInvalidNumber;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please fill any  number from 10000 up to 99999");
            anyNumber = scanner.nextInt();

            isInvalidNumber = anyNumber < 10_000 || anyNumber >= 100_000;
            if (isInvalidNumber) {
                System.out.println("Incorrect value. Please try again...");
            }
        } while (isInvalidNumber);
        int[] numbers = new int[5];
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = anyNumber % 10;
            anyNumber /= 10;
        }
        printArray(numbers);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

