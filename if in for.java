import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner data = new Scanner(System.in);
        System.out.println("enter the number");
        num = data.nextInt();
        for(int count = 1;count<=10;count++)
        {
            if(count==4){
                break;
            }
            System.out.println(count);
        }
        
            
        }
    }
