import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the num");
        int num1=data.nextInt();
        System.out.println("num:"+num1);
        if(num1%2==0){
         System.out.println("even");
        }
        else{
         System.out.println("odd");
        }
          
        
    }
}
