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
