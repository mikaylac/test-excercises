public enum InsertedCoin {

    PENNY(2.5, 19.05),
    SLUG(4.3, 20.01),
    NICKEL(5.00, 21.21),
    DIME(2.27, 17.91),
    QUARTER(5.67, 24.26);

    private double weightInGrams;
    private double diameterInMillimeters;
    private double valueInCents;

    private InsertedCoin(double weightInGrams, double diameterInMillimeters){
        this.weightInGrams = weightInGrams;
        this.diameterInMillimeters = diameterInMillimeters;
    }

    public double getWeightInGrams(){
        return this.weightInGrams;
    }

    public double getDiameterInMillimeters(){
        return this.diameterInMillimeters;
    }

}
