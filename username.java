import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
   
        String username;
        String password;
        System.out.println("Enter the username:");
        username = data.nextLine();
        System.out.println("Enter the password:");
        password = data.nextLine();
        if (username.equals("admin") && password.equals("admin@123")) {
            System.out.println("The username and password are correct.");
        } else {
            System.out.println("The username and password are incorrect.");
        }

        data.close();
    }
}
