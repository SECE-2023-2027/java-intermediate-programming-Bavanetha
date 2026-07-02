class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void makeWork() {
        System.out.println("Washing Machine is washing clothes.");
    }
}
