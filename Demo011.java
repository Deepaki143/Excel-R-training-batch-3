import java.util.Scanner;
public class Demo011 {
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
    Demo011 obj = new Demo011();
    obj.input();
    obj.display();
 }

}
