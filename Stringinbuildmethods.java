
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
