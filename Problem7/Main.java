import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the brand of the washing machine: ");
        String brand = sc.nextLine();
        Appliance app = new WashingMachine(brand);
        app.turnOn();
        app.makeWork();
    }
}
