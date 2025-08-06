import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[7];
        System.out.println("Enter 7 names:");
        for (int i = 0; i < 7; i++) names[i] = sc.nextLine();
        System.out.print("Name to delete: ");
        String del = sc.nextLine();
        for (int i = 0; i < 7; i++)
            if (names[i].equalsIgnoreCase(del)) names[i] = null;
        System.out.print("Name to rename: ");
        String oldName = sc.nextLine();
        System.out.print("New name: ");
        String newName = sc.nextLine();
        for (int i = 0; i < 7; i++)
            if (names[i] != null && names[i].equalsIgnoreCase(oldName)) names[i] = newName;
        System.out.println("Updated names:");
        for (String name : names)
            if (name != null) System.out.println(name);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seats = {"Seat1", "Seat2", "Seat3", "Seat4", "Seat5", "Seat6", "Seat7"};
        String[] names = new String[7];  // Parallel array to hold names
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add person to seat");
            System.out.println("2. Remove person from seat");
            System.out.println("3. Update person's name");
            System.out.println("4. Display seat assignments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter seat number (1-7): ");
                    int addIndex = sc.nextInt() - 1;
                    sc.nextLine(); // Clear buffer
                    if (addIndex >= 0 && addIndex < 7) {
                        if (names[addIndex] == null) {
                            System.out.print("Enter name: ");
                            names[addIndex] = sc.nextLine();
                            System.out.println("Name added to " + seats[addIndex]);
                        } else {
                            System.out.println("Seat already occupied!");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter seat number (1-7) to remove: ");
                    int removeIndex = sc.nextInt() - 1;
                    sc.nextLine(); // Clear buffer
                    if (removeIndex >= 0 && removeIndex < 7) {
                        if (names[removeIndex] != null) {
                            names[removeIndex] = null;
                            System.out.println("Person removed from " + seats[removeIndex]);
                        } else {
                            System.out.println("Seat already empty.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter seat number (1-7) to update: ");
                    int updateIndex = sc.nextInt() - 1;
                    sc.nextLine(); // Clear buffer
                    if (updateIndex >= 0 && updateIndex < 7) {
                        if (names[updateIndex] != null) {
                            System.out.print("Enter new name: ");
                            names[updateIndex] = sc.nextLine();
                            System.out.println("Seat " + seats[updateIndex] + " updated.");
                        } else {
                            System.out.println("Seat is empty.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;
                case 4:
                    System.out.println("\nSeat Assignments:");
                    for (int i = 0; i < 7; i++) {
                        System.out.println(seats[i] + ": " + (names[i] != null ? names[i] : "[Empty]"));
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
