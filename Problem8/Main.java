import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int choice;
        do {
            System.out.println("Choose the shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double radius = sc.nextDouble();
                    Shape circle = new Circle(radius);
                    System.out.println("Area of Circle: " + circle.getArea());
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth of rectangle: ");
                    double breadth = sc.nextDouble();
                    Shape rectangle = new Rectangle(length, breadth);
                    System.out.println("Area of Rectangle: " + rectangle.getArea());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while(choice != 3);
    }
}
