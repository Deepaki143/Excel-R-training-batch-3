import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Multiples of 5 up to " + num + ":");
        for (int i = 5; i <= num; i += 5) {
            System.out.println(i);
        }

        int nearestMultipleOf5 = roundToNearestMultipleOf5(num);
        System.out.println("Nearest multiple of 5 to " + num + ": " + nearestMultipleOf5);
    }

    public static int roundToNearestMultipleOf5(int num) {
        return (num + 4) / 5 * 5;
    }
}
