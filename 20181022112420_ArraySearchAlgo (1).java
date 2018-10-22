package arraysearchalgo;

import java.util.Scanner;
import java.util.Random;

public class ArraySearchAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomObj = new Random();

        int element, elementfound;
        int i, j, rn, searchNumber;
        int locationFound = -1;

        System.out.println("How many elements ");
        element = sc.nextInt();
        int[] array = new int[element];

        System.out.println("Random numbers are  ");
        for (i = 0; i < element; i++) {
            rn = randomObj.nextInt(1000);
            array[i] = rn;

        }
        for (j = 0; j < element; j++) {
            System.out.println( j+1 +": " + array[j]);

        }
        System.out.println(" ");
        System.out.println("Which number to search ");
        searchNumber = sc.nextInt();
        for (j = 0; j < element; j++) {
            if (array[j] == searchNumber) {
                locationFound = j + 1;
            }
        }
        if (locationFound == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(" ");
            System.out.println("Element found at index " + locationFound);
        }
System.out.println(" ");
        System.out.println("End of this assignment");
    }

}
