

import java.util.Scanner;
public class TheaterSeatBooking {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter total number of seats: ");
        int size = data.nextInt();
        data.nextLine(); 
        int[] seatNumbers = new int[size];
        String[] personNames = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter seat number " + (i + 1) + ": ");
            seatNumbers[i] = data.nextInt();
            data.nextLine(); 
            System.out.print("Enter name for seat " + seatNumbers[i] + ": ");
            personNames[i] = data.nextLine();
        }
        System.out.println("\n--- Current Bookings ---");
        for (int i = 0; i < size; i++) {
            if (personNames[i] != null) {
                System.out.println("Seat " + seatNumbers[i] + ": " + personNames[i]);
            }
        }
       System.out.print("\nEnter the name to delete: ");
        String deleteName = data.nextLine();
        boolean found = false;
        int deletedIndex = -1;

        for (int i = 0; i < size; i++) {
            if (deleteName.equalsIgnoreCase(personNames[i])) {
                personNames[i] = null;
                deletedIndex = i;
                found = true;
                System.out.println(deleteName + " has been removed from seat " + seatNumbers[i]);
                break;
            }
        }

        if (!found) {
            System.out.println("Person not found.");
        } else {
            System.out.print("Enter new name to assign to seat " + seatNumbers[deletedIndex] + ": ");
            String newName = data.nextLine();
            personNames[deletedIndex] = newName;
            System.out.println("Seat " + seatNumbers[deletedIndex] + " assigned to " + newName);
        }
        System.out.println("\n--- Final Bookings ---");
        for (int i = 0; i < size; i++) {
            if (personNames[i] != null) {
                System.out.println("Seat " + seatNumbers[i] + ": " + personNames[i]);
            }
        }

        data.close();
    }
}
