//prime number cheack

import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Num: "); 
        int num = sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if (num%i==0) {
                count++;
            }
        }
        if(count>2){
            System.out.println(num+" is not prime");
        }else{
            System.out.println(num+" is prime");
        }
    }
    
}
