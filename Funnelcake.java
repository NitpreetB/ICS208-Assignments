
public class Funnelcake 
{

	private String size; 
	private int eat; 
	private double price; 
	private int toppings; 
	private static int count=0;
//constructor 

	public Funnelcake (String sz, int et, double pr, int top)
	{
		this.size=sz;
		this.eat=et;
		this.price=pr;
		this.toppings =top;
		count = count +1;
	}
	
	Funnelcake ()
	{
		size= "Small";
		eat= 1;
		price=  6.50;
		toppings=2;
		count = count +1;
	}
	
	// getters 
	public static int getCount()
	{
		return count;
	}
	public String getSize()
	{
	return size; 
	}
	
	public int geteat()
	{
	return eat;
	}
	
	public double getprice()
	{
	return price; 
	}
	
	public int gettoppings()
	{
		return toppings; 
	}
	
	//setters 
	public void setSize (String sz)
	{
	size = sz; 
	}
	
	public void setEat (int et)
	{
	eat = et; 
	}
	
	public void setPrice (double pr)
	{
	price = pr; 
	}

	
	//method for adding toppings 
	
	public int addToppings(int num)
	{
		toppings = toppings + num;
		return toppings;
	}
	
	//methods for discount price 
	
	public double discountPrice (int num1)
	{
		double discount; 
		discount = price *(num1)* 0.1;
		price = price - discount;
		return price;
	}
}
