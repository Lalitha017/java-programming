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
