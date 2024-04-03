package test;

public class Money implements IMoney {
    private int fAmount;
    private String fCurrency;

    public Money(int amount, String currency) {
        fAmount = amount;
        fCurrency = currency;
    }

    public int amount() {
        return fAmount;
    }

    public String currency() {
        return fCurrency;
    }

    public IMoney add(IMoney aMoney) {
	    if (aMoney instanceof Money && ((Money) aMoney).currency().equals(currency())) {
	        return new Money(amount() + ((Money) aMoney).amount(), currency());
	    } else {
	        MoneyBag moneyBag = new MoneyBag(this, (Money) aMoney);
	        if (this.fAmount == 0) {
	            return (IMoney) aMoney;
	        }
	        return moneyBag;
	    }
	}

    public boolean equals(Object obj) {
        if (this == obj) { 
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Money other = (Money) obj;
        return fAmount == other.fAmount && fCurrency.equals(other.fCurrency);
    }

    
}
