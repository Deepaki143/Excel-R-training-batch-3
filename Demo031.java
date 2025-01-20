import java.util.HashSet;
import java.util.Scanner;

public class Demo031 {
    public static void main(String[] args) {
        HashSet<Object> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's information (name, roll number, address) separated by commas: ");
        String[] info = scanner.nextLine().split(",");

        for (String s : info) {
            s = s.trim();
            if (s.matches("[a-zA-Z ]+")) {
                students.add("Name: " + s);
            } else if (s.matches("\\d+")) {
                students.add("Roll Number: " + s);
            } else {
                students.add("Address: " + s);
            }
        }

        scanner.close();

        System.out.println("Student Information:");
        for (Object student : students) {
            System.out.println(student);
        }
    }
}