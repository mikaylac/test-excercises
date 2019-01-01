import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class CoinSlotTest {

    @Test
    public void shouldAddOnlyValidCoinToTotal(){
        CoinSlot coinSlot = new CoinSlot(null);
        coinSlot.insertCoin(InsertedCoin.DIME);
        coinSlot.insertCoin(InsertedCoin.PENNY);

        BigDecimal expectedTotal = new BigDecimal(".10");
        assertEquals(expectedTotal, coinSlot.getTotal());
    }

    @Test
    public void shouldReturnInvalidCoins(){
        CoinSlot coinSlot = new CoinSlot(new CoinReturn());
        InsertedCoin expectedReturnedCoin = InsertedCoin.SLUG;
        coinSlot.insertCoin(expectedReturnedCoin);
        assertThat(coinSlot.getCoinReturn().getReturnedCoins().get(0), is(expectedReturnedCoin));
    }
}
