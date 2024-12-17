/*
 * This source file was generated by the Gradle 'init' task
 */
package assignment02_7;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Enter an array size: ");
        int size = scanIn.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
        System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanIn.nextInt();
        }

        System.out.println("In order:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanIn.close();
    }
}
