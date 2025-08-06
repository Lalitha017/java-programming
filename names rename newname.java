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
