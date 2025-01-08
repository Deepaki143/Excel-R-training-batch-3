
import java.util.Scanner;

public class PS002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Multiples of 100 up to " + num + ":");
        for (int i = 100; i <= num; i += 100) {
            System.out.println(i);
        }
    }
}
