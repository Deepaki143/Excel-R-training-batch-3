public class Demo060 {
    public static void main(String[] args) {
        int n = 20;
        int num1 = 0;
        int num2 = 1;
        System.out.println("Fibonacci Series of " + n + " numbers:");
        System.out.print(num1+" "+num2);
        for (int i = 1; i <= n; i++) {
            int sum = num1 + num2;
            System.out.print(" "+sum);
            num1 = num2;
            num2 = sum;
        }
    }
}