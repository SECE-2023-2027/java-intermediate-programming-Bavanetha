public interface TaxRules {
    public static final double TAX_RATE = 0.15;

    public abstract double calculateTax(double itemValue);
}
