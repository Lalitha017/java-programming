//
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String a = "New World";
        String b = "Hello /World/Java";
        String y = "Hello/World";
        String x = ".*World.*"; 
        System.out.println("Hello".matches(x));    

  //replace
     import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String x = "hello";
        String y = "hello abc hello";
        System.out.println(x.replace('l','p'));
        String a = "(?i)Hello";
        System.out.println(y.replace(a,"hi"));  
        String b = "Hello";
        System.out.println(y.replaceFirst(b,"hi")); 
    }
}
 //spilt
    public class Main {
    public static void main(String[] args) {
        String x="Hello World";
        String y="[,\\.\\s]";
        String[] z=x.split(y);
        for(String  s:z){
        System.out.print(s);
    }
}

//string
import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = sc.nextLine();
        String y = "[\\.\\s]";  
        String[] z = x.split(y);
        String concatenated = "";
        System.out.println("Split parts:");
        for (String s : z) {
            System.out.println(s);
            concatenated += s;
        }
        System.out.println("Concatenated string: " + concatenated);
    }
}  

//starts with
        import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = sc.nextLine(); 
        System.out.println(x.startsWith("hello"));  
        System.out.println(x.startsWith("he"));    
        sc.close();
    }
}

//substring
  import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the data:");
        String x = input.nextLine(); 
        System.out.println(x.startsWith("hello"));  
        System.out.println(x.startsWith("he"));    
        if (x.length() >= 5) {
            String sub = x.substring(0, 5);
            System.out.println("Substring (first 5 chars): " + sub);
        } else {
            System.out.println("String is too short for a 5-character substring.");
        }
        input.close();
    }
}

//uppercsae
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the data:");
        String x = input.nextLine();
        String lower = x.toLowerCase();
        System.out.println(lower.startsWith("hello"));
        System.out.println(lower.startsWith("he"));
        if (x.length() >= 5) {
            String sub = x.substring(0, 5).toUpperCase(); 
            System.out.println("Substring (first 5 chars, uppercase): " + sub);
        } else {
            System.out.println("String is too short for a 5-character substring.");
        }
        input.close();
    }
}
//valueof
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the data:");
        String x = input.nextLine();
        System.out.println(String.valueOf(x));
        System.out.println(String.valueOf(true));
        input.close();
    }
}

//




