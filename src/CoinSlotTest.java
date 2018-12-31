import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CoinSlotTest {

    @Test
    public void shouldAddOnlyValidCoinToTotal(){
        CoinSlot coinSlot = new CoinSlot();
        coinSlot.insertCoin(InsertedCoin.DIME);
        coinSlot.insertCoin(InsertedCoin.PENNY);

        BigDecimal expectedTotal = new BigDecimal(".10");
        assertEquals(expectedTotal, coinSlot.getTotal());
    }
}
