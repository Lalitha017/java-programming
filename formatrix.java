//2cross2
class Main {
    public static void main(String[] args) {
        int[][] arr = new int[2][2]; 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = i + j;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//3cross3
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 8, 3},
            {7, 9, 6},
            {7, 8, 3}
        };
        for (int i = 0; i < 3; i++) {           
            for (int j = 0; j < 3; j++) {       
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();              
        }
    }
}
//
class Main {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[3][3]; 
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[0][2] = 1;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[2][0] = 1;
        arr[2][1] = 0;
        arr[2][2] = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int[][] arr = new int[x][y]; 
        int num = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int[][] arr = new int[x][y]; 
        int num = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = num++;
            }
        }
        for (int i = 0; i < x / 2; i++) {
            int temp = arr[i][1];
            arr[i][1] = arr[x - 1 - i][1];
            arr[x - 1 - i][1] = temp;
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        int row = x.nextInt(); 
        int col = x.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = x.nextInt(); 
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        int row = x.nextInt(); 
        int col = x.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = x.nextInt(); 
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10,11,12}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
