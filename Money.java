
public class Money
{
	private double total;
	
	public Money()
	{
		total = 200;
	}
	
	public void add(double money)
	{
		total += money;
	}
	
	public void sub(double money)
	{
		total -= money;
	}
	
	//gives money to another player
	public double payOther(double give)
	{
		total -= give; 
		
		return give;
	}
}
