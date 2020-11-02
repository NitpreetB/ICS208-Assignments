import java.io.*;
import java.util.*;
public class Teachers {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		//variables 
		ArrayList <String> teachers = new ArrayList <String>();
		
		//call methods
		inputArrayList(teachers); 
		output(teachers); 
		findLongest (teachers);
		findShortest(teachers); 

	}
	public static void findShortest (ArrayList<String>teachers){
		String smallWord = teachers.get(0); 
		String word; 
		for (int i = 1; i<11; i++)
		{
			word = teachers.get(i); 
			if (word.length() < smallWord.length())
			{
				smallWord = teachers.get(i); 
			}
		}
		System.out.println(" "); 
		System.out.println("The teacher with the smallest name is "+smallWord); 
	}
	public static void findLongest (ArrayList <String> teachers){
		String word, bigWord = " "; 
		int length; 
		for (int i = 0; i<11; i++)
		{
			word = teachers.get(i); 
			length = word.length(); 
			if (length>bigWord.length())
			{
				bigWord = teachers.get(i);  
			}
		}
		System.out.println(" "); 
		System.out.println("The longest name is "+bigWord); 
	}
	public static void output (ArrayList <String> teachers){
		for (int i = 0; i<11; i+=2)
		{
			if (i==10)
			{
				System.out.println(teachers.get(i)); 
			}
			else 
			{
			System.out.println(teachers.get(i)+" "+teachers.get(i+1));
			}
		}
	}
	public static void inputArrayList (ArrayList <String> teachers) throws IOException{
		File janu = new File ("teachers.txt");
		FileReader jolin = new FileReader(janu); 
		BufferedReader jenny = new BufferedReader(jolin);
		String word; 
		try{
			
			jenny = new BufferedReader(jolin); 
			while((word = jenny.readLine())!=null)
			{
				teachers.add(word);
			}
			jenny.close(); 
			jolin.close();
		}catch (IOException find){
				
				System.out.println("FIX YOURSELF ");
			}
		
		
	}

}
