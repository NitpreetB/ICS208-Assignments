 import java.util.*;
public class charactername {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 
String [] names= new String[7];
int [] vowels= new int [7];
int [] c = new int [7];
int largest;

largest=0;
		
names=names(names);
c = consanents(names, vowels, c );
vowels= vowels(names, vowels, c );
largest= vowels2(largest, vowels);
print(names, c);
print2(names, vowels, largest);

 
	}
public static String[] names ( String[] names)
{
	Scanner kb = new Scanner(System.in);

	for (int x=0;x<7;x++)
	{
		System.out.println("Please enter a name ");
		names[x]=kb.nextLine();
	}
	
	return names;
}
	
public static int [] consanents (String names[], int vowels[], int c[])
{
	for(int x=0;x<7;x++)
	{
		//names[x].charAt(0);
		//System.out.println(names[x]);
		
		for(int y=0;y<names[x].length();y++)
		{
			if (names[x].charAt(y)== 'a'|| names[x].charAt(y)== 'e' || names[x].charAt(y)== 'i' || names[x].charAt(y)== 'o' || names[x].charAt(y)== 'u' || names[x].charAt(y)== 'y' )
			{
				vowels[x]++;
				c[x]=names[x].length()-vowels[x];
				
			}
		}
	}
	return c;
}
public static int [] vowels (String names[], int vowels[], int c[])
{
	for(int x=0;x<7;x++)
	{
		//names[x].charAt(0);
		//System.out.println(names[x]);
		
		for(int y=0;y<names[x].length();y++)
		{
			if (names[x].charAt(y)== 'a'|| names[x].charAt(y)== 'e' || names[x].charAt(y)== 'i' || names[x].charAt(y)== 'o' || names[x].charAt(y)== 'u' || names[x].charAt(y)== 'y' )
			{
				vowels[x]++;
				c[x]=names[x].length()-vowels[x];
				System.out.println("Then number of consinants is "+c[x]);
			}
		}
	}
	return vowels;

}
public static int vowels2 (int largest, int[]vowels)
{
	for (int x=0; x<7; x++)
	{
		//largest=names[x].length()-c[x];
		
		if (vowels[x]> largest)
		{
			largest=x;
			
		}
		
	}
	return largest;
}

public static void print(String[] names, int[] c)
{
	for (int x=0; x<7; x++)
	{
		System.out.format("\n %6s %6s" , names[x],c[x]);
	}
}
public static void print2(String[] names, int[] vowels, int largest)
{
	System.out.println("\n the name with most vowels is "+names[largest] +" with " + vowels[largest] + " vowels");
}
}
