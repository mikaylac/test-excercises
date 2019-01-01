import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CoinReturnTest {

    @Test
    public void shouldAddInsertedCoinToReturn(){
        CoinReturn coinReturn = new CoinReturn();
        InsertedCoin expectedCoinToReturn = InsertedCoin.SLUG;
        coinReturn.addCoin(expectedCoinToReturn);

        List<InsertedCoin> returnedCoins = coinReturn.getReturnedCoins();
        assertThat(returnedCoins.size(), is(1));
        assertThat(returnedCoins.get(0), is(expectedCoinToReturn));
    }
}
