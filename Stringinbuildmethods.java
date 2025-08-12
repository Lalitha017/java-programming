
//charAt
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String str = data.nextLine(); 
        char ch = str.charAt(0);     
        System.out.println("The Character is:"+ch);
    }
}

//codePointAt
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String str = data.nextLine(); 
        int codePoint = str.codePointAt(0); 
        System.out.println("The Unicode code point is: " + codePoint);
    }
}
//codePointBefore

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String str = data.nextLine(); 
        char ch = str.charAt(0);     
        System.out.println("The Character is:"+ch);
        char ch1 = (char) str.codePointBefore(3);
        System.out.println("The Before Character is:"+ch1);
        char ch2 = (char) str.codePointAt(4);
        System.out.println("The After Character is:"+ch2);
    }
}
//codePointCount
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String str = data.nextLine(); 
        int codePointCount = str.codePointCount(0, str.length()); 
        System.out.println("The Unicode code point count is: " + codePointCount);
    }
}
//compareTo
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter Name1:");
        String str = data.nextLine();
        System.out.println("Enter Name2:");
        String str1=data.nextLine();
        char ch = str.charAt(0);
        System.out.println("The Character is: " + ch);
        char ch1 = (char) str.codePointBefore(3);
        System.out.println("The Character Before is: " + ch1);
        char ch2 = (char) str.codePointAt(4);
        System.out.println("The Character After is: " + ch2);
        int ch3 = str.codePointCount(0, 4);
        System.out.println("The number is: " + ch3);
        int ch4=str.compareTo(str1);
        System.out.println("Result:"+ch4);

 //comparetoIgnorecase()
  import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter Name1:");
        String str1 = data.nextLine();
        System.out.println("Enter Name2:");
        String str2 = data.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Both names are equal (ignoring case).");
        } else {
            System.out.println("Names are different.");
        }
        data.close();
    }  
}
        
//contentics        
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter any String1:");
        String str1 = x.nextLine();
        boolean my = str1.contains("Hello");
        System.out.println(my);
        boolean mystr = str1.contentEquals("Hello");
        System.out.println(mystr);
    }
}  

//copyvalueof()
        public class Main {
    public static void main(String[] args) {
        char[] data = {'H','E','L','L','O'};
        
        String str = String.copyValueOf(data, 0, 5);
        System.out.println(str);

        System.out.println(str.endsWith("H"));
    }
} 
    //forloop
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text:");
        String input = sc.nextLine();
        char[] data = input.toCharArray();
        String str = String.copyValueOf(data);
        System.out.println("String from char array: " + str);
        char[] charArray = str.toCharArray();
        System.out.print("Char array from string: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        String str2 = String.copyValueOf(charArray);
        System.out.println("String again from char array: " + str2);
        sc.close();
    }
}
   //format
    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String data = "hello";
        String hi = "hi %s my age %d";
        System.out.println(data.equalsIgnoreCase("hello"));
        System.out.printf(hi, "hello", 20);
    }
}
        
        
        
