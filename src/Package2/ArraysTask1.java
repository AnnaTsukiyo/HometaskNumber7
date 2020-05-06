package Package2;

import java.util.Scanner;

public class ArraysTask1 {

    public static void main(String[] args) {
        int[] floors = generateNumberOfFloors();
        printArray(floors);
    }
    static int[] generateNumberOfFloors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill numbers of floors.");
        int[] floors = new int[scanner.nextInt()];

        for (int i = 0, j = 1; i < floors.length; i++) {
            if (i == 12) {
                j++;
            }
            floors[i] = j++;
        }
        return floors;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}