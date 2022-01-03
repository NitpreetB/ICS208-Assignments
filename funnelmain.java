import java.util.*;
public class funnelmain {
	
	
	public static void main(String[] args) 
	{
		printMenu();
		Funnelcake [] cakes = new Funnelcake [10];
		Scanner kb= new Scanner(System.in);
		String input;
		int option;
		
		do

		{
			System.out.println(" ");
			//System.out.println(" ");
			System.out.println("Please select an option:");
			input = kb.nextLine();
			
			option = Integer.parseInt(input);
			
			if (option==1)
			{
				createFunnelCake(cakes);
			}
			else if (option==2)
			{
				
				addtoppings(cakes,kb);
			}
			else if (option==3)
			{
				printall(cakes);
			}

			else if (option==4)

			{
				medium (cakes,kb);

			}
			else if (option==5)

			{
				threetopp (cakes,kb);

			}
			else if (option==6)

			{
				changeprice(cakes,kb);

			}
			

		}while (option!=7);
		System.out.println("Thank You!");
		
	}
	public static void printMenu()
	{
		System.out.println("Please select one of the 7 options below ->");
	
		System.out.println("1. Create a default funnel cake ");
		System.out.println("2. Add a topping to a funnel cake .");
		System.out.println("3. Print all funnel cakes  ");
		System.out.println("4. Print the number of funnel ckaes that are medium ");
		System.out.println("5. Print the number of funnel cakes with 3 toppings ");
		System.out.println("6. change the price of a funnel cake ");
		//System.out.println("8. change the size of a funnel cake ");
		System.out.println("7. Exit");
	}
	public static void createFunnelCake(Funnelcake []cakes)
	{
		
		int c;
		c = Funnelcake.getCount();
		cakes[c]=new Funnelcake();
		
	}
		
	public static void printall(Funnelcake [] cakes)
	{
		int c;
		c = Funnelcake.getCount();
		for (int x=0;x<c;x++)
		{
			System.out.println(cakes[x].getprice());
			
		}
		
	}
		
	public static void threetopp (Funnelcake []cakes, Scanner kb)
	{
		int counts=0;
		int f = Funnelcake.getCount();
	
		for (int x=0;x<f;x++)
		{
			if (cakes[x].gettoppings()==3){
				counts++;
			}
			else
			{
				
			}
		}
		System.out.println(" the number of funnel cakes with more than 3 toppings are  "+counts);
	 
	}
	public static void medium (Funnelcake []cakes, Scanner kb)
	{
		int counts=0;
		int f = Funnelcake.getCount();
	
		for (int x=0;x<f;x++)
		{
			if (cakes[x].getSize()=="Medium"){
				counts++;
			}
			else
			{
				
			}
		}
		System.out.println(" the number of funnel cakes that are size medium are "+counts);
	 
	}
	public static void addtoppings(Funnelcake []cakes, Scanner kb){
		
		System.out.println("which funnel cake would you like to add a topping for ");
		String input = kb.nextLine();
		int x = Integer.parseInt(input);
		
		
		System.out.println("how many toppings will you like to add");
		String input1 = kb.nextLine();
		int y = Integer.parseInt(input1);
		int a=cakes[x].addToppings(y);
		
		System.out.println("funnel cake number "+x+"has "+ a +"total topping");
	
	}
	public static void changeprice(Funnelcake []cakes, Scanner kb){
		
		System.out.println("which funnel cake would you like to change the price for ");
		String input = kb.nextLine();
		int x = Integer.parseInt(input);
		
		System.out.println("how many 10% discounts would you like");
		String input1 = kb.nextLine();
		int y = Integer.parseInt(input1);
		double p= cakes[x].discountPrice(y);
		
		System.out.println("funnel cake number "+x+"has a new price of "+p);
	}
	
}
