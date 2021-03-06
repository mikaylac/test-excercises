import java.math.BigDecimal;

public class CoinSlot {

    private BigDecimal total;
    private CoinReturn coinReturn;

    public CoinSlot(CoinReturn coinReturn){
        this.total = new BigDecimal("0.00");
        this.coinReturn = coinReturn;
    }

    public void insertCoin(InsertedCoin insertedCoin){
        ValidCoin[] validCoins = ValidCoin.values();
        for(int i = 0; i < validCoins.length; i++){
            ValidCoin validCoin = validCoins[i];
            if(insertedCoin.getWeightInGrams() == validCoin.getWeightInGrams() &&
                insertedCoin.getDiameterInMillimeters() == validCoin.getDiameterInMillimeters()){
                    this.total = this.total.add(new BigDecimal(Double.toString(validCoin.getValueInCents())));
            } else {
                this.coinReturn.addCoin(insertedCoin);
            }
        }
    }

    public BigDecimal getTotal(){
        return this.total;
    }

    public CoinReturn getCoinReturn(){
        return this.coinReturn;
    }
}
