import java.util.Scanner;
//even or odd
public class program2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Num: "); 
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even num");
        }else{
            System.out.println("Odd num");
        }
    }
    
}
