import java.io.*;
import java.util.*;
public class CakesV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		//variables
		ArrayList <String> cakes = new ArrayList <String>(); 
		int num; 
		
		inputArrayList(cakes);
		
		//variables
		num = cakes.size(); 
		int [] vowels = new int [num]; 
		
		findVowels(cakes, vowels); 
		findMostVowels (vowels, cakes); 
		findLeastVowels (vowels, cakes);

	}
	public static void findLeastVowels (int [] vowels, ArrayList <String> cakes){
		int small = vowels[0]; 
		int size = cakes.size(); 
		String smallWord = " "; 
		for (int i = 1; i<size; i++)
		{
			if (vowels[i]<small)
			{
				small = vowels[i]; 
				smallWord = cakes.get(i); 
			}
		}
		System.out.println(" "); 
		System.out.println("The cake with the least number of vowels is "+cakes.get(3)); 
		System.out.println("The cake with the least number of vowels is "+smallWord); 

	}
	public static void findMostVowels (int [] vowels, ArrayList <String> cakes){
		int size = cakes.size(); 
		int big = 0; 
		String bigWord = " ";
		for (int i = 0; i<size; i++)
		{
			if (vowels[i]>big)
			{
				vowels[i] = big; 
				bigWord = cakes.get(i); 
			}
		}
		System.out.println(" "); 
		System.out.println("The cake with the greatest number of vowels is "+bigWord); 
	}
	public static void findVowels (ArrayList <String> cakes, int [] vowels){
		int size = cakes.size(); 
		String word = " "; 
		int counter; 
		
		for (int i = 0; i<size; i++)
		{
			counter = 0; 
			word = cakes.get(i); 
			for (int x = 0; x<word.length(); x++)
			{
				 if (word.charAt(x) == 'a'|| word.charAt(x) == 'e'|| word.charAt(x) == 'i' || word.charAt(x) == 'o' || word.charAt(x) == 'u')
				 {
					 counter = counter+1; 
					 vowels[i] = counter; 
				 }
			}
			System.out.println(cakes.get(i)+"   "+vowels[i]); 
		}

	}
	public static void inputArrayList (ArrayList <String> cakes) throws IOException{
		File data = new File ("cakes.txt");
		FileReader read = new FileReader(data); 
		BufferedReader br = new BufferedReader(read);
		String word; 
		try{
			
			br = new BufferedReader(read); 
			while((word = br.readLine())!=null)
			{
				cakes.add(word);
			}
			br.close(); 
			read.close();
		}catch (IOException find){
				
				System.out.println("FIX YOURSELF ");
			}
	}

}
