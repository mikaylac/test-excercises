public enum ValidCoin {

    NICKEL(5.00, 21.21, .05),
    DIME(2.27, 17.91, .10),
    QUARTER(5.67, 24.26, .25);


    private double weightInGrams;
    private double diameterInMillimeters;
    private double valueInCents;

    private ValidCoin(double weightInGrams, double diameterInMillimeters, double valueInCents){
        this.weightInGrams = weightInGrams;
        this.diameterInMillimeters = diameterInMillimeters;
        this.valueInCents = valueInCents;
    }

    public double getWeightInGrams(){
        return this.weightInGrams;
    }

    public double getDiameterInMillimeters(){
        return this.diameterInMillimeters;
    }

    public double getValueInCents(){
        return this.valueInCents;
    }


}
