//range
import java.util.Scanner;
public class NumberCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if (number < 1 || number > 10) {
            System.out.println("Please enter a number between 1 and 10.");
        } else {
            System.out.println("Combinations of numbers (1 to 10) that add up to " + number + ":");
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    if (i + j == number) {
                        System.out.println(i + " + " + j + " = " + number);
                    }
                }
            }
        }

  //autophobic
  public class AutophobicNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int square = i * i;
            String numberStr = Integer.toString(i);
            String squareStr = Integer.toString(square);
            if (squareStr.contains(numberStr)) {
                System.out.println(i + " squared is " + square + " -> " + numberStr + " is found in " + squareStr);
            }
        }
    }
}
