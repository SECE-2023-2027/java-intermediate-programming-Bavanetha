import java.util.Scanner;

class Computer{
    private String processorModel;

    public Computer(String processorModel) {
        this.processorModel = processorModel;
    }

    class Processor{
        public void displayDetails() {
            System.out.println("Processor Model: " + processorModel);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the processor model: ");
        String model = sc.nextLine();
        Computer comp = new Computer(model);
        Computer.Processor proc = comp.new Processor();
        proc.displayDetails();
    }
}
