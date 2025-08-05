import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        int num = 145;
        BigInteger factorial = BigInteger.ONE;

        for (int i = 2; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + num + " is:");
        System.out.println(factorial);
    }
}
