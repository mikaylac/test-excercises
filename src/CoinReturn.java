import java.util.ArrayList;
import java.util.List;

public class CoinReturn {

    private List<InsertedCoin> returnedCoins;

    public CoinReturn(){
        this.returnedCoins = new ArrayList<>();
    }

    public void addCoin(InsertedCoin coinToAdd){
        this.returnedCoins.add(coinToAdd);
    }

    public List<InsertedCoin> getReturnedCoins(){
        return this.returnedCoins;
    }
}
