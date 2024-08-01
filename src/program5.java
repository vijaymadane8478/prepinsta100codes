import java.util.Scanner;
//sum of range
public class program5 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Num1: "); 
        int num1 = sc.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = sc.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
 }   
}
