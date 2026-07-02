class BillingSystem implements TaxRules {
    @Override
    public double calculateTax(double itemValue) {
        return itemValue * TAX_RATE;
    }
    
}
