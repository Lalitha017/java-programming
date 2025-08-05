import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = data.nextInt();
        System.out.println("num: " + num1);

        boolean isPrime = true;

        if (num1 <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("notprime");
        }
    }
}
