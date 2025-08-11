///sub array
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = 3;
        int b = 4;
        int[] sub = new int[b - a];
        for (int i = a; i < b; i++) {
            sub[i - a] = arr[i];
        }
        System.out.println(Arrays.toString(sub));  
    }
}

///merged array
class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 3};
        int[] arr2 = {4, 5, 7};
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
//sum of array
class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        if (arr1.length != arr2.length) {
            System.out.println("Arrays must be of same length!");
            return;
        }
        int[] sumArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }
        System.out.print("Sum of arrays: ");
        for (int num : sumArray) {
            System.out.print(num + " ");
        }
    }
}
//user input
import java.util.Scanner;
class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the arrays: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] sumArray = new int[n];  
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }
        System.out.print("Sum of arrays: ");
        for (int num : sumArray) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 3};
        int[] arr2 = {4, 5, 7};
        if (arr1.length != arr2.length) {
            System.out.println("Arrays must be of the same length!");
            return;
        }
        int[] sum = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        System.out.print("Sum array: ");
        for (int value : sum) {
            System.out.print(value + " ");
        }
    }
}


