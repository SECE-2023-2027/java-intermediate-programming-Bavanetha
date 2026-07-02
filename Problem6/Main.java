import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Choose the shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("Area of Circle: " + AreaCalculator.calculateArea(radius));
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth of rectangle: ");
                    double breadth = sc.nextDouble();
                    System.out.println("Area of Rectangle: " + AreaCalculator.calculateArea(length, breadth));
                    break;
                case 3:
                    System.out.print("Enter side of square: ");
                    int side = sc.nextInt();
                    System.out.println("Area of Square: " + AreaCalculator.calculateArea(side));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while(choice != 4);
    }
}