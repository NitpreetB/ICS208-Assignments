import java.util.*;
public class Wonderland 
{
	
	public static void main(String[] args) 
	{
		printMenu();
		FunnelCake [] cakes = new FunnelCake [10];
		Scanner kb= new Scanner(System.in);
		String input;
		int option;
		
		// do while loop for user to select an option 
		do
		{
			System.out.println(" ");
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
				
				changeprice(cakes,kb);
				
			}

			else if (option==4)

			{
				changesize (cakes,kb);
				

			}
			else if (option==5)

			{
				medium (cakes,kb);

			}
			else if (option==6)

			{
				threetopp (cakes,kb);
			}
			
			else if (option ==7)
			{

				printall(cakes);
			}
			
		} while (option!=8);
		System.out.println("Thank You!");
		
	}
	public static void printMenu() 
	//method to output all 8 menu options
	//exit when user inputs 8
	{
		System.out.println("1. Create a default Funnel cake.");
        System.out.println("2. Add a topping to a Funnel cake.");
        System.out.println("3. Change the price of a Funnel cake.");
        System.out.println("4. Change the size of a Funnel cake. ");
        System.out.println("5. Print the number of Funnel cakes that are medium.");
        System.out.println("6. Print the number of Funnel cakes with 3 toppings.");
        System.out.println("7. Print all Funnel cakes.");
        System.out.println("8. Exit");
	}
	
	//method to create default Funnel cake 
	public static void createFunnelCake(FunnelCake []cakes)
	{
		int c;
		c = FunnelCake.getCount();
		cakes[c]=new FunnelCake();
	}
	
	//method to print all attributes for each Funnel cake 
	public static void printall(FunnelCake [] cakes)
	{
		int c;
		c = FunnelCake.getCount();
		for (int x=0;x<c;x++)
		{
			System.out.println("The number of people eating this Funnel cake is "+ cakes[x].getEat());
			System.out.println("The price of this Funnel cake is " +cakes[x].getPrice());
            System.out.println("The size of this Funnel cake is "+cakes[x].getSize());
            System.out.println("The number of toppings on this Funnel cake is " +cakes[x].getToppings());
            System.out.println("   ");
		}
		
	}
	
	//method to check and output the number of Funnel cakes with more than 3 toppings 
	public static void threetopp (FunnelCake []cakes, Scanner kb)
	{
		int counts=0;
		int f = FunnelCake.getCount();
	
		for (int x=0;x<f;x++)
		{
			if (cakes[x].getToppings()==3) 
			{
				counts++;
			}
			else
			{
				
			}
		}
		
		System.out.println("The number of Funnel cakes with more than 3 toppings are "+counts);
	 
	}
	
	//method to check and output the number of Funnel cakes that are size Medium 
	public static void medium (FunnelCake []cakes, Scanner kb)
	{
		int counts=0;
		int f = FunnelCake.getCount();
	
		for (int x=0;x<f;x++)
		{
			if (cakes[x].getSize()=="Medium"){
				counts++;
			}
			else
			{
				
			}
		}
		System.out.println("The number of Funnel cakes that are size Medium are "+counts + ".");
	 
	}
	
	//method to add a specific number of toppings, as requested by the user
	//add the user's preference of number of toppings to the default number of toppings 
	//output the total number of topings for Funnel cake x
	public static void addtoppings(FunnelCake []cakes, Scanner kb){
		
		System.out.println("Which funnel cake would you like to add a topping for? ");
		String input = kb.nextLine();
		int x = Integer.parseInt(input);
		
		System.out.println("How many toppings will you like to add?");
		String input1 = kb.nextLine();
		int y = Integer.parseInt(input1);
		int a =cakes[x].addToppings(y);
		
		System.out.println("Funnel cake number "+x+" has "+ a +" total topping.");
	
	}
	//method to change the price for the selected Funnel cake 
	//asks user how many 10% discounts they would like 
	//outputs the updated price of the Funnel Cake 
	public static void changeprice(FunnelCake []cakes, Scanner kb){
		
		System.out.println("Which Funnel cake would you like to change the price for?");
		String input = kb.nextLine();
		int x = Integer.parseInt(input);
		
		System.out.println("How many 10% discounts would you like?");
		String input1 = kb.nextLine();
		int y = Integer.parseInt(input1);
		double p= cakes[x].discountPrice(y);
		
		System.out.println("Funnel cake number "+x+" has a new price of "+p);
	}
	
	//method for changing the size for specific funnel cakes    
    public static void changesize(FunnelCake []cakes, Scanner kb)
    {
        
         System.out.println("Which Funnel cake would you like to change the size for?");
         String input = kb.nextLine();
         int x = Integer.parseInt(input);
         
         System.out.println("Which size would you like to change it to?");
         String input1 = kb.nextLine();
        
         cakes[x].setSize(input1);
         System.out.println("Funnel cake number "+x+" is now size "+input1);
    }
}
