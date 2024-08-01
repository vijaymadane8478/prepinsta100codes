import java.util.Scanner;
//leap year or not
public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter year: "); 
        int year = sc.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println(year+"is leap year");
        }else{
            System.out.println(year+"is not leap year");
        }
    }
    
}
