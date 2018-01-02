package money;

public class Money implements Expression{
	protected int amount;
	protected String currency;
	
	Money(int amount,String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& currency().equals(money.currency());
	}
	static Money dollar(int amount) {
		
		return new Money(amount,"USD");
	}
	static Money franc(int amount) {
		return new Money(amount,"CHF");
	}
	 public Expression times(int multiplier) {
		 return new Money(amount * multiplier,currency);
	 }
	 
	String currency() {
		return currency;
	}
	public String toString() {
		return amount + "" + currency;
	}
	@Override
	public Expression plus(Expression added) {
		return new Sum(this,added);
	}

	public Money reduce(Bank bank,String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
	

	
}
