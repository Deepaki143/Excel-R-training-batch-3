import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        scanner.close();

        int years = minutes / 525600; // 525600 minutes in a non-leap year
        int remainingMinutes = minutes % 525600;

        System.out.println(minutes + " minutes is approximately " + years + " years");
        System.out.println("Remaining minutes: " + remainingMinutes);
    }
}

