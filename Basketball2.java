import java.util.*;
import java.io.*;
public class Basketball2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> choice = new ArrayList();
		ArrayList<String> player = new ArrayList<String>();
		ArrayList<String> team = new ArrayList<String>();
		ArrayList<String> city = new ArrayList<String>();
		ArrayList<Double> points = new ArrayList<Double>();
 
		readFile(player, team, city, points);
		
		//printFile(team);
		
		System.out.println("Please select one of the five options below ->");
		System.out.println("1. Display all the players with more than 20 points.");
		System.out.println("2. Display the city that scored the most points.");
		System.out.println("3. Display the number of characters of each player with more than 23 points.");
		System.out.println("4. Display the player with the least amount of points who plays for the Warriors.");
		System.out.println("5. Exit.");
	
		Scanner kb= new Scanner(System.in);
		String input;
		int option;
		
		do
		{
			System.out.println(" ");
			System.out.println("Please select an option:");
			input = kb.nextLine();
			choice.add(input);
			option = Integer.parseInt(input);

			if (option==1)
			{
				twentypoints(points, player);
			}
			
			else if (option==2)
			{
				mostpoints(points, city);
			}
			
			else if (option==3)
			{
				characters(points, player);
			}
			
			else if (option==4)
			{
				leastPoints(points, player, team, city);
				
			}
			
		}while (option!=5);
		System.out.println("The points from least to greatest for all the players is: " );
		bubbleSort (points);
		System.out.println("Thanks for playing!");
		
		kb.close();		
	}
	
	
	public static void printFile (ArrayList choice)
	{
		int length;
		length = choice.size()-1;
		
		for (int x=0;x<length;x++)
		{
			System.out.println(choice.get(x));
			
		}
		
	}
	
	public static void readFile (ArrayList<String> player, ArrayList<String> team, ArrayList<String> city, ArrayList<Double> points) throws IOException
	{
		
		File file = new File("basketball.txt");
		FileReader read = new FileReader (file);
		BufferedReader bf = new BufferedReader(read);
		String input = "";
		
		while (input != null)
		{
			input = bf.readLine();
			if(input != null){
				player.add(input.substring(0,22));
				team.add(input.substring(22,40));
				city.add(input.substring(40,56));
				points.add(Double.parseDouble(input.substring(56, 60)));
			}
		}
		
		read.close();
		bf.close();
	}
	
	public static void twentypoints (ArrayList<Double> points, ArrayList <String> player)
	{
		int counter;
		counter=0;
		String index;
		index=" ";
		
		for (int x=0;x<20;x++)
		{
			if (points.get(x)>20)
			{
				System.out.println(player.get(x));
				index=player.get(x);
				counter=counter++;
			}
		}
	}
	
	public static void mostpoints (ArrayList<Double> points, ArrayList <String> city)
	{
		double highest;
		highest = 0;
		String index;
		index = " ";
		
		for (int x=0;x<20;x++)
		{
			if (points.get(x)>highest)
			{
				highest = points.get(x);
				index = city.get(x);
			}
		}
		
		System.out.println("The city of the player that scored the most number of points (" + highest + " points) is " + index);
	}
	
	public static void characters (ArrayList<Double> points, ArrayList <String> player)
	{
		int counter;
		counter=0;
		int index;
		index=0;
		
		for (int x=0;x<20;x++)
		{
			if (points.get(x)>23)
			{
				index=player.get(x).replaceAll("\\s+",",").length()-2;
				System.out.println(player.get(x)+" ");
				System.out.print("Averages "+points.get(x)+" points ");
				System.out.println("and his name has "+index+" characters\n");
				counter=counter++;
			}
		}
		
	}
	
	public static void leastPoints (ArrayList<Double> points, ArrayList <String> player, ArrayList<String>team, ArrayList<String>city)
	{
		
		double highest;
		highest = 0;
		
		
		for (int x=0;x<20;x++)
		{
			if (points.get(x)>highest)
			{
				highest = points.get(x);
				
			}
		}
		
		
		int counter;
		counter=0;
		
		double index;
		index=0;
		
		double low;
		low = highest;
		
		for (int x=0;x<20;x++)
		{
			if (team.get(x).equals("  Warriors        "))
			{
				index=points.get(x);
				//System.out.println(index);
				counter=counter++;
				
				if (index<low)
				{
					low=index;
					
				}
			}
		}
		
		for (int x=0;x<20;x++)
		{
			if (points.get(x)==low)
			{
				System.out.println("The player on the Warriors that scored the least number of points is " + player.get(x));
			
			}
		}
	}
	
	public static void bubbleSort (ArrayList<Double> points)
	{
		
		
		 double [] pointss = new double[20];
		
		 for (int x=0;x<20;x++){
			 pointss[x]=points.get(x);
		 }
		 
		 
		double size;
		
		
		int i,j;
		double temp=0.0;
		for (int x=0; x<(pointss.length-1);x++){
			
			for (int y=0; y <pointss.length-1-x; y++){
				
				if (pointss[y]>pointss[y+1]){
					temp= pointss[y];
					pointss[y]= pointss[y+1];
					pointss[y+1]= temp;
					
					
				}
			}
		}
		
		for (int a = 0; a<20; a++)
		{
			System.out.println(pointss[a]);
		}
	}
}
		

