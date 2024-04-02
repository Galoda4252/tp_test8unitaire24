package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMixed {

	private Money f12CHF = new Money(12, "CHF");
    private Money f7USD = new Money(7, "USD");
  
    @Test
    public void testMixedSimpleAdd() {
        
        Money bag[] = { f12CHF, f7USD };
        MoneyBag expected = new MoneyBag(bag);
        assertEquals(expected, f12CHF.add(f7USD));
    }
}
