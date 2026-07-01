public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();
        System.out.println(v1.startEngine());
        System.out.println(v2.startEngine());
    }
}
