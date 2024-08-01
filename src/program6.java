import java.util.Scanner;
//greatest of 2 numbers
public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Num1: "); 
        int num1 = sc.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("both are equal");
        }else if (num1>num2) {
            System.out.println(num1+"is greater");
        }else{
            System.out.println(num2+"is greater");
        }
    }
    
}
