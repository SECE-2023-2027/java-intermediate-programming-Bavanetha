import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item value: ");
        double itemValue = sc.nextDouble();
        
        BillingSystem billingSystem = new BillingSystem();
        double taxAmount = billingSystem.calculateTax(itemValue);
        
        System.out.println("Tax amount: " + taxAmount);
    }
}
