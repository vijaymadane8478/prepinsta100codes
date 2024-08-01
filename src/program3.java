//sum of N natural num

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Num: "); 
        int num = sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
    }
}
