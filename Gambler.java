import java.util.*;
public class Gambler {

	/**
	Nitpreet
	 */
//Method to generate random numbers for each gamble	
public static int randomizer(ArrayList<Integer> lottery)
{
	int num, days= 0;
	do
	{
		days++;
		num = (int) (Math.random()*21);
		lottery.add(num);
	}while(num!=0);
	return days;
}

//Method to find total of array list
public static int total(ArrayList<Integer> lottery, int days)
{
	int total = 0;
	for (int x =0;x<days;x++)
	{
		total = total + lottery.get(x);
	}
	return total;
}

//Method to output
public static void output(int days, int totalWinnings)
{
	System.out.println("It took "+days+" day(s) before a zero appeared.");
	System.out.println("The total amount of money won was $"+totalWinnings+".");
}

	public static void main(String[] args) {
		//Variables
		ArrayList<Integer> lottery = new ArrayList();
		int days, totalWinnings;
		
		//Methods
		days = randomizer(lottery);
		totalWinnings = total(lottery, days);
		output(days, totalWinnings);
			
		
		
	}

}
