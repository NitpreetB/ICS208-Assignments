import java.util.*;
public class Arraylsiy {

		public static void main(String[] args) {
			// variables
			
			ArrayList<String> friends = new ArrayList();
			ArrayList<Integer> ages = new ArrayList();
		
			inputFriends (friends,ages);
			outputFriends (friends,ages);
			largestage (friends,ages); 
		}
		
		
		public static void outputFriends (ArrayList friends,ArrayList ages)
		{
			int number;
			number = friends.size();
			for (int x=0;x<number;x++)
			{
				System.out.println(friends.get(x)+"    "+ages.get(x));	
			}
		}
		public static void largestage (ArrayList friends,ArrayList ages)
		{
			
		int highest =0, number ; 
		String index = " ";
		number=	friends.size();
		
		for(int x=0;x<number; x++)
		{
			if ( (Integer) ages.get(x) > highest)
			{
				highest = (Integer) ages.get(x);
				
				index= (String) friends.get(x);
				
			}
			
		}
		System.out.println( index + " has the highest age, which is " + highest);
			
		}
		public static void inputFriends (ArrayList friends,ArrayList ages)
		{
			Scanner kb= new Scanner(System.in);
			String input;
			int age;
			
			System.out.println("Please input your names and ages as promted.");
			System.out.println("When you are finished enter X for the name and 0 for the age.");
	do
			{
				System.out.println("Please input a name.");
				input = kb.nextLine();
				friends.add(input);
				System.out.println("Please input the age.");
				input = kb.nextLine();
				age = Integer.parseInt(input);
				ages.add(age);
				
}while (age != 0);
		}

	
		
	}
