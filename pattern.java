public class Main {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <=rows; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print( j + " ");
            }
            System.out.println(); 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String name = "QWERTY";
        int n = name.length();
        
        
        for (int i = 1; i <= n; i++) {
            
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j) + " ");
            }

            
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(name.charAt(j) + " ");
            }

            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

           
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j) + " ");
            }

            
            for (int j = i - 2; j >= 0; j--) {
                System.out.print(name.charAt(j) + " ");
            }

            System.out.println();
        }
    }
}

