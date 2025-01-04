import java.util.Scanner;
public class EmpDetails {
    private String username;
    private long bnkaccount;
    private int blnce; 
    void input(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your name");
    username=sc.nextLine();
    System.out.println("Enter acc number: ");
    bnkaccount=sc.nextLong();
    System.out.println("Enter your balance is :");
    blnce= sc.nextInt();   
    }
    void display(){
        System.out.println("Hello "+username+"\nYour account number is:"+bnkaccount+"\nYour Balance is:"+blnce);
    }
    public static void main(String args[]){
    EmpDetails obj = new EmpDetails();
    obj.input();
    obj.display();
 }

}