
//methods
class Main {
    public static void main(String[] args) {
        myMethod("hello world");
    }

    public static void myMethod(String name) {
        System.out.println(name);
    }
}

//int
import java.util.Scanner;
public class Main {
    static void mymethod(int x, int y) {
        System.out.println(x + y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        mymethod(a, b); 
    }
}

//names
import java.util.Scanner;
public class Main {
    static void myMethod(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = data.next();
        System.out.print("Enter last name: ");
        String last = data.next();
        myMethod(first, last);
        data.close();
    }
}

//age
import java.util.Scanner;
public class Main {
    static void myMethod(String firstName, String lastName, int age, double height) {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String first = data.next();
        System.out.print("Enter the last name: ");
        String last = data.next();
        System.out.print("Enter the Age: ");
        int age = data.nextInt();
        System.out.print("Enter the height: ");
        double height = data.nextDouble();
        myMethod(first, last, age, height);
        data.close();
    }
}

//calculator
import java.util.Scanner;
public class Calculator {
    static double add(double a, double b) {
        return a + b;
    }
    static double subtract(double a, double b) {
        return a - b;
    }
    static double multiply(double a, double b) {
        return a * b;
    }
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }
}

//login
mport java.util.Scanner;
class Main {
    public static class Instagram {
        static void myLogin() {
            Scanner data = new Scanner(System.in);
            System.out.print("Enter user name: ");
            String username = data.nextLine();
            System.out.println("Welcome, " + username + "!");
        }
    }
    public static void main(String[] args) {
        Instagram.myLogin();
    }
}
//insta login
import java.util.Scanner;
public class Main {
    public static boolean instaLogin(String username, String password) {
        return username.equals("instauser") && password.equals("insta@123");
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the insta username:");
        String username = data.nextLine();
        System.out.println("Enter the insta password:");
        String password = data.nextLine();
        if (instaLogin(username, password)) {
            System.out.println("insta login successful (simulated).");
        } else {
            System.out.println("insta login failed (simulated).");
        }

        data.close();
    }
}
//snapchat
import java.util.Scanner;
public class Main {
    private static final String USERNAME = "snapuser";
    private static final String PASSWORD = "snap@123";
    public static boolean snapChatLogin(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the Snapchat username:");
        String username = data.nextLine();
        System.out.println("Enter the Snapchat password:");
        String password = data.nextLine();
        if (snapChatLogin(username, password)) {
            System.out.println("Snapchat login successful.");
        } else {
            System.out.println("Snapchat login failed.");
        }
        data.close();
    }
}

//methods
class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Main obj = new Main(); 
        obj.sample();        
    }
    public void sample() {    
        int a = 17;
        System.out.println(a); 
    }
}

//instatnt class
class Main1 {
    public void add(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }
}
class Sub1 extends Main1 {
    public void showSub1() {
        System.out.println("Subclass 1");
        add(10, 20);
    }
}
class Sub2 extends Main1 {
    public void showSub2() {
        System.out.println("Subclass 2");
        add(30, 40);
    }
}
class Sub3 extends Main1 {
    public void showSub3() {
        System.out.println("Subclass 3");
        add(50, 60);
    }
}
public class Main {
    public static void main(String[] args) {
        Sub1 obj1 = new Sub1();
        obj1.showSub1();
        Sub2 obj2 = new Sub2();
        obj2.showSub2();
        Sub3 obj3 = new Sub3();
        obj3.showSub3();
    }
}


