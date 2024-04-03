package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMixed {
	
    @Test
    public void testMixedSimpleAdd() {
        Money f12CHF = new Money(12, "CHF");
        Money f7USD = new Money(7, "USD");
        Money bag[] = { f12CHF, f7USD };
        MoneyBag expected = new MoneyBag(bag);
        assertEquals(expected, f12CHF.add(f7USD));
    }

    @Test
    public void testBagSimpleAdd() {
        Money f12CHF = new Money(12, "CHF");
        Money f7USD = new Money(7, "USD");
        Money[] bag = { f12CHF };
        MoneyBag expected = new MoneyBag(bag);
        assertEquals(expected, new MoneyBag(bag).add(f7USD));
    }

   
   
}
