
//sum of digit

import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num= sc.nextInt();
        int sum=0;
        while (num!=0) {
            sum+=num%10;
            num=num/10;
        }
        System.out.println("Sum is "+sum);
    }
    
}
