import java.util.*;
public class FamilyProgram {
	/**
	 * Srijay & Nitpreet
	 */
	
	
	private static void FirstName(String nams[][], int x)
	{
		
		int Char;
		Char=0;
		Char=nams[x][0].length();
		System.out.println("the first name is " + Char + " letters Long");
	}
	
	
	
	
	private static void input(String namesA[][], int roes, int collumbs)
	{
	
		
		Scanner kb = new Scanner(System.in);
				
		for (int i=0; i<roes; i++)
				{
					System.out.println("name for person " + (i+1) + " (enter mom name, maiden name, and last name)");
					
					for (int z=0; z<collumbs; z++)
					{
						namesA[i][z] = kb.nextLine();
					}
					FirstName(namesA, i);
				}			
	}
	
	

	
	private static void Maiden(String names[][], int collumbs)
	{
		
		String longestName;
		longestName=names[0][1];
		int highestchar;
		highestchar= names[0][1].length();
		
		for (int x=0; x<collumbs; x++)
			{
				if (highestchar < names[x][1].length())
				{
					highestchar = names[x][1].length();
					longestName = names[x][1];
				}
			}
		System.out.println("longest maidain name is " + longestName + " and has " + highestchar + " characters");
	}
	
	
	
	private static void average(String names[][], int roes)
	{
	
		int average=0;
		average=0;
		int total;
		total=0;
		
			for (int x=0; x<roes; x++)
			{
				total = total + names[x][2].length();
			}
		
		average = total/roes;
		
		System.out.println("The average number of letters in last name is " + average);
	}
	
	

	public static void main(String[] args) {
		// declare variables
		String names [][] = new String [5][3];
		int rows;
		rows=5;
		int columns; 
		columns=3;
		
	
		input(names, rows, columns);
	
		Maiden(names, columns);
	
		average(names, rows);
		

		

	}

}
