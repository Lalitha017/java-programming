import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age (byte): ");
        byte age = input.nextByte();
        System.out.print("Enter your school passing year (short): ");
        short passingYear = input.nextShort();
        System.out.print("Enter your area pincode (int): ");
        int pincode = input.nextInt();
        System.out.print("Enter your phone number (long): ");
        long phoneNumber = input.nextLong();
        System.out.print("Enter your height in meters (float): ");
        float height = input.nextFloat();
        System.out.print("Enter your weight in kg (double): ");
        double weight = input.nextDouble();
        System.out.print("Enter your middle initial (char): ");
        char middleInitial = input.next().charAt(0);
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();
        System.out.println("\n--- User Information ---");
        System.out.println("Age: " + age);
        System.out.println("School Passing Year: " + passingYear);
        System.out.println("Pincode: " + pincode);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Middle Initial: " + middleInitial);
        System.out.println("Student Status: " + isStudent);
        input.close();
    }
}
