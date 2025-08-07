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
//ugly num
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println(num + " is an Ugly Number.");
            scanner.close();
            return;
        }

        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        if (num == 1) {
            System.out.println("UGLY Number");
        } else {
            System.out.println(" STRONG Number");
        }
        scanner.close();
    }
}
//sum of numbers
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("sum of all numbers:");
        for (int i = 0; i < count - 1; i++) {
            int sum = numbers[i] + numbers[i + 1];
            System.out.println(numbers[i] + " + " + numbers[i + 1] + " = " + sum);
        }
    }
}


