class Main {
    public static void main(String[] args) {
        string [] array={"abc","efg","hij"};
        array[1]="hij";
        System.out.println("array[1]");
    }
}


IF FOR
class Main {
    public static void main(String[] args) {
        String[] array = {"abc", "efg", "hig"};

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("efg")) {
                array[i] = "abc";
                System.out.println("Updated value: " + array[i]); 
            }
            System.out.println("Value at index " + i + ": " + array[i]);
            System.out.println("Second element: " + array[1]);
        }
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String[] array = {"aaa", "bbb", "ccc", "ddd", "eee", "fff"};
        array[1] = "aaa"; 
        System.out.println(array[1]); 
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
            if (array[i].equals("ccc")) {
                array[i] = "eee";
            }
        }

        System.out.println("Updated array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


       

       


    
