import java.util.Scanner;
//Check if a Number is Positive or Negative in Java
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Num: 0"); 
        int num = sc.nextInt();
        if(num>0){
            System.out.println("positive number");
        }else if (num<0) {
            System.out.println("negative number");
        }else{
            System.out.println("zero");
        }
    }
    
}
