import java.util.Scanner;
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a shape to calculate area:");
        System.out.println("option1. Circle");
        System.out.println("option2. Triangle");
        System.out.println("option3. Square");
        System.out.println("option4. Rectangle");
        System.out.print("Choose any one option (1-4): ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area = π × r × r");
                System.out.println("Area of Circle = " + circleArea);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = input.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = input.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area = 0.5 × base × height");
                System.out.println("Area of Triangle = " + triangleArea);
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                double side = input.nextDouble();
                double squareArea = side * side;
                System.out.println("Area = side × side");
                System.out.println("Area of Square = " + squareArea);
                break;
            case 4:
                System.out.print("Enter the length of the rectangle: ");
                double length = input.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = input.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area = length × width");
                System.out.println("Area of Rectangle = " + rectangleArea);
                break;
            default:
                System.out.println("Invalid option. Please choose between 1 and 4.");
        }

        input.close();
    }
}
