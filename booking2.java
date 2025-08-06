import java.util.Scanner;
public class TheaterBooking {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter total number of bookings: ");
        int n = data.nextInt();
        data.nextLine(); 
        int[] seatNumbers = new int[n];
        String[] personNames = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter seat number for booking " + (i + 1) + ": ");
            seatNumbers[i] = data.nextInt();
            data.nextLine(); 
            System.out.print("Enter person name for seat " + seatNumbers[i] + ": ");
            personNames[i] = data.nextLine();
        }
        System.out.println("\nCurrent Bookings:");
        for (int i = 0; i < n; i++) {
            if (seatNumbers[i] != -1) {
                System.out.println("Seat No: " + seatNumbers[i] + " - " + personNames[i]);
            }
        }
        System.out.print("\nEnter the name to delete: ");
        String deleteName = data.nextLine();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (personNames[i] != null && personNames[i].equalsIgnoreCase(deleteName)) {
                seatNumbers[i] = -1;      
                personNames[i] = null;    
                found = true;
                System.out.println(deleteName + " deleted successfully.");
            }
        }

        if (!found) {
            System.out.println("Name not found!");
        }

        System.out.println("\nUpdated Bookings:");
        for (int i = 0; i < n; i++) {
            if (seatNumbers[i] != -1) {
                System.out.println("Seat No: " + seatNumbers[i] + " - " + personNames[i]);
            }
        }

        data.close();
    }
}
