import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner data = new Scanner(System.in);
        System.out.println("enter the number");
        num = data.nextInt();
        do
        {
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        while (num >= 18) ;
        
    } 
}
        
               
             
