//sum of N natural num using formula

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Num: "); 
        int num = sc.nextInt();
        System.out.println("sum= "+(num*(num+1)/2));
    }
}
