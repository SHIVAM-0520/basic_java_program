import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
     System.out.print("enter your number: ");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int a = 0;
     int b = 1;
     System.out.print("your fibonacci series is: "+a +" " +b);
     for(int i=1;i<=n-2;i++)
     {
        int next = a + b;
        System.out.print( " "+next);
        a = b;
        b = next;
     }
    }
}
