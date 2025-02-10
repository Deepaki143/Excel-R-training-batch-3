import java.util.*;
class Demo019a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n=sc.nextInt();
        Demo019a d = new Demo019a();
        d.Display(n);
    }
    void Display(int n){
        System.out.println("Fibonacci series of "+n+": ");
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}