package question1;

public class MonetaryCoins extends Coin {
	protected int value;
	public MonetaryCoins(int mValue) {
		
		value = mValue;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public int add(MonetaryCoins[]coins) 
	{
	
		
		int total = value;
		
		if(coins.length==0)
			return total;
		
		for (int i=0; i<coins.length; i++) {
			
			total +=coins[i].getValue();
		}
		
		return total;
		
		
	}

}
