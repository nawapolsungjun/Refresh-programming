
package assignment02_4;
import java.util.Scanner;

public class App {
    public static boolean Num(int num) {
        if (num <= 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int number = scanIn.nextInt();

        for (int i = 1; i <= number;i++) {
            if (Num(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
