import java.util.Scanner;
//prime number within a range
public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Num1: "); 
        int num1 = sc.nextInt();  
        System.out.println("Enter Num2: "); 
        int num2 = sc.nextInt();   

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

       