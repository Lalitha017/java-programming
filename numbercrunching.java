import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = data.nextInt();
        System.out.print("Enter ending number: ");
        int end = data.nextInt();
        int randomNum = start + (int)(Math.random() * ((end - start) + 1));

        System.out.println("Random number is:"  + randomNum);
        data.close();
    }
}
