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

//
