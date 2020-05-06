package Package2;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask3 {

    public static void main(String[] args) {

        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(randomNumbers));

        int maximumNumber = 0;

        for (int i = 0; i < randomNumbers.length; i++) {
            if (maximumNumber < randomNumbers[i]) {
                maximumNumber = randomNumbers[i];
            }
        }
        System.out.println("Maximum value in the array is : " + maximumNumber);

        int minimumNumber = randomNumbers[0] + 1;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] < minimumNumber) {
                minimumNumber = randomNumbers[i];
            }
        }
        System.out.println("Minimum value in the array is : " + minimumNumber);

        System.out.printf("Delta of maximum and minimum values in the array is : %d%n", maximumNumber - minimumNumber);
    }
}




